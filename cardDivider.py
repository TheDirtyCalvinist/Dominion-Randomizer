#! /usr/bin/python

import re

class Card:
    
    def __init__(self):
        self.title = ""
        self.set = ""
        self.type = ""
        self.cost = ""
        self.text = ""
        self.clarification = ""
    
#    def __init__(self, title, set, type, cost, text, clarification):
#        self.title = title
#        self.set = set
#        self.type = type
#        self.cost = cost
#        self.text = text
#        self.clarification = clarification

    def __str__(self):
        return self.title + "\n" + self.set + "\n" + self.type + "\n" + self.cost + "\n" + self.text + "\n" + self.clarification

cardMatch = re.compile("Card: (.*)")
setMatch = re.compile("Set: (.*)")
typeMatch = re.compile("Type: (.*)")
costMatch = re.compile("Cost: (.*)")
textMatch = re.compile("Text: (.*)")
rulesMatch = re.compile("Rules Clarification: (.*)")

def parseCard(cardString):
    cardLines = re.split("\n", cardString)
    card = Card()
    for line in cardLines:
        match = cardMatch.match(line)
        if match:
            card.title = match.group(1).strip()
            continue
        match = setMatch.match(line)
        if match:
            card.set = match.group(1).strip()
            continue
        match = typeMatch.match(line)
        if match:
            card.type = match.group(1).strip()
            continue
        match = costMatch.match(line)
        if match:
            card.cost = match.group(1).strip()
            continue
        match = textMatch.match(line)
        if match:
            card.text = match.group(1).strip()
            continue
        match = rulesMatch.match(line)
        if match:
            card.clarification = match.group(1).strip()
            continue   
        
    return card

# MAIN 

f = open("Complete_Card_list.txt")

fileString = ""

for line in f:
    fileString = fileString + line

# break the file into card text    
cardTextList = re.split("\n\n", fileString)

setNameList = ["Basic", "Intrigue", "Seaside", "Alchemy", "Prosperity", "Cornucopia", "Promo"]

setNameCardListMap = dict()
setNameFileMap = dict()

for name in setNameList:
    setNameCardListMap[name] = list()
    setNameFileMap[name] = open(name + "_title_list", "w")

# break the card texts into component parts and write to files
for cardText in cardTextList:
    card = parseCard(cardText)
    setNameCardListMap[card.set].append(card)
    setNameFileMap[card.set].write(card.title + "\n")    
    
for key, cardList in setNameCardListMap.iteritems():
    for card in cardList:
        print card.title.replace(" ", "_").replace("'","").upper() + "(\"" + card.title + "\", DominionSet." + key.upper() + "),"
    print "\n"