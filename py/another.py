import requests

r = requests.get('https://www.google.com')		#returns the html code of that web page

print(r.text)

payload = {'uname':'','passwd':''}
r = requests.post('https://internet.iitb.ac.in', data = payload)


____________________________________________________________________________________________

from bs4 import BeautifulSoup

import requests

r = requests.get('http://www.imdb.com/title/tt0451279/')

temp = r.content

soup = BeautifulSoup(temp, "html.parser")

rating = soup.find('span', attrs='rating-rating').contents[0]
#contents = soup.find('span', attrs='rating-rating')
print(soup.title)
print(rating)
print(soup.find_all("a", limit =1))
#print(contents)
#print(str(soup)) 