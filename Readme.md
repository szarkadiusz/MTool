# MTool

App for production line monitoring
With use of Raspberry Pi, infrared sensonrs, MongoDB and some code You will able to monitor Your production line, to follow efficiency, targets etc.

App have been written in Spring and it,s divided for to apps:

# Mtool
- which is main app and it's responsible to gather data from Mongo DB and present in at Web application hosted on Tomcat. Charts presented are made with google charts

# MTool Listener
- which is core Java app and with some logic data are gathered from infrared sensors and togetgher with time stamp, they're sent to MongoDB database by IP protocol
