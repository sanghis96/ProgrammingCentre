#http://www.lfd.uci.edu/~gohlke/pythonlibs/#scipy			--Download
#https://www.dataquest.io/blog/machine-learning-python/		--Tutorial

# Import the pandas library.
import pandas as pd

# Read in the data.
games = pd.read_csv("games.csv")
# Print the names of the columns in games.
print(games.columns)

print(games.shape)

# Import matplotlib
import matplotlib.pyplot as plt

# Make a histogram of all the ratings in the average_rating column.
plt.hist(games["average_rating"])

# Show the plot.
plt.show()

games[games["average_rating"] == 0]

# Print the first row of all the games with zero scores.
# The .iloc method on dataframes allows us to index by position.
print(games[games["average_rating"] == 0].iloc[0])
# Print the first row of all the games with scores greater than 0.
print(games[games["average_rating"] > 0].iloc[0])

# Remove any rows without user reviews.
games = games[games["users_rated"] > 0]
# Remove any rows with missing values.
games = games.dropna(axis=0)