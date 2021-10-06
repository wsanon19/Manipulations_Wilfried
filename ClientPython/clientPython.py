from zeep import Client

if __name__ == '__main__':

	client = Client("http://localhost:8686/?wsdl")
	resultat = client.service.average(19,15,17)

	print(resultat)

# resultat_1 = client.service.listePersonnes()
# for elt in resultat_1:
# 	print("Nom :" + elt["nom"])
# 	print("Age :"  + elt["age"])
#
# option = Settings(raw_response=True)
#
# client = Client("http://localhost:8686/?wsdl", settings=option)
# resultatXML = client.service.listePersonnes()
#
# print(resultatXML.text)
