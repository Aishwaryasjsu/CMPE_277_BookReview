


BookReview



By
Mega Minds
Aishwarya Lodhi (015960412)
Srinishaa Prabhakaran (16176914)
Rishabh Gupta (016672851)









Link to Codebase: https://drive.google.com/file/d/1nN1UNOm4Stcvg_eRKpY-r_InjulbWop3/view?usp=sharing 

Link to app demo: https://drive.google.com/file/d/1NgWk3_kC5hro--FWLJTqFlk6NxLDyJWE/view?usp=sharing 

Link to PPT: https://docs.google.com/presentation/d/1yBaUtbe4EtikY036_ur1f8Iu4lLUcAgTikryPTh2qLg/edit?usp=sharing 







































Project Description

BookReview is a feature-rich Android application that utilizes machine learning techniques to provide users with valuable insights into book reviews. By leveraging the power of natural language processing and sentiment analysis, BookReview categorizes reviews as positive or negative, enabling users to gauge the overall sentiment towards a particular book. The application offers an intuitive and visually appealing user interface, allowing users to input reviews. Additionally, BookReview incorporates Object-Oriented Programming principles, such as inheritance, abstraction, encapsulation, and polymorphism, ensuring code reusability, maintenance, and program enhancement.

BookReview adopts a data-centric architecture, utilizing Firebase Realtime Database for efficient storage of user reviews. The application incorporates various classes, including Book and Reviews, following the Object-Oriented Programming approach. Additionally, there are classes for activities such as MainActivity, AppIntro, SliderAdapter, ProductList, ProductDetail, ProductReviews, and others. The utilization of methods throughout the project ensures code reuse, minimizes duplication, and enhances program maintenance and reusability. Concepts such as inheritance, abstraction, encapsulation, and polymorphism are leveraged to optimize the architecture.

BookReview is developed using Java, XML, and Python, making it compatible with the Android platform. The application makes use of a data-centric architecture, utilizing Firebase Realtime Database to store user reviews. TensorFlow and TensorFlow Lite, along with other external libraries, are employed for machine learning capabilities and sentiment classification. Android Studio serves as the primary development tool for coding, while Firebase handles data storage.




Requirements
Functional Requirements
User Registration: Users should be able to create an account or sign up using their credentials to access the BookReview application.
Book Search: Users should be able to search for books based on title, author, genre, or other relevant criteria.
Ratings & Reviews: Users should be able to rate and provide detailed reviews for books they have read.
Sentiment Analysis & display: The application should analyze the text of user reviews using machine learning algorithms to determine the sentiment (positive or negative) expressed.
Sentiment Categorization: The application should categorize the overall sentiment of a book based on the collective analysis of user reviews.
Book Favorites: Users should have the ability to mark books as favorites for easy access and future reference.
User Interaction: The user interface should be intuitive, allowing users to easily input book reviews, navigate through the application, and view the overall sentiment.
Non-Functional Requirements
Performance: The application should provide a responsive and seamless user experience, with minimal loading times for search results and review analysis.
Security: User data, including personal information and reviews, should be securely stored and protected.
Scalability: The application should be able to handle a growing user base and a large volume of book reviews without significant performance degradation.
Usability: The user interface should be visually appealing, easy to navigate, and designed with user-friendly interactions in mind.
Reliability: The application should be stable and reliable, minimizing crashes and errors during user interactions.
Accessibility: The application should adhere to accessibility standards, ensuring that users with disabilities can access and use the features effectively.
Technical Requirements
Programming Language: The application should be developed using Java, Kotlin, XML.
Machine Learning Framework: TensorFlow and TensorFlow Lite should be utilized for training and implementing the sentiment classification model.
Database: Firebase Realtime Database should be employed to store and retrieve user reviews and other relevant data.
Local Storage: The application should leverage the use of local storage to store user data on the device.
Libraries: External libraries such as Firebase ML SDKs and Firebase DB SDKs should be integrated to enable machine learning and database functionalities.
Development Environment: Android Studio should be used as the primary integrated development environment (IDE) for coding and testing the application.
Compatibility: The application should be compatible with Android devices running on the specified minimum Android version.
Data Privacy: The application should comply with relevant data privacy regulations and protect user data from unauthorized access.
Device Requirements:
1. Memory & Storage: A basic storage, memory should be available to run the project.
2. Emulator Requirements: If using an emulator to run the BookReview app, it is recommended to use Android Virtual Device (AVD).
3. Physical Device: BookReview is designed to run on a wide range of Android devices. It is compatible with popular device manufacturers such as Samsung, Google, LG, Xiaomi, and others. The device should meet the basic processor, memory, storage, and display requirements.

High Level Architecture Design

BookReview adopts a data-centric architecture, utilizing Firebase Realtime Database for efficient storage of user reviews. The application follows the Model-View-Controller (MVC) design pattern to separate concerns and manage data flow. The Model represents the data structure and logic, including classes such as Book and Reviews. The View is responsible for the user interface, which includes activities like MainActivity, AppIntro, SliderAdapter, ProductList, ProductDetail, ProductReviews, and others. The Controller acts as an intermediary, handling user interactions, updating the Model, and synchronizing data between the View and the Firebase Realtime Database.

To enhance program flexibility and maintainability, the Factory design pattern is employed. The Factory design pattern is used to dynamically create instances of classes, such as generating product recommendations. By encapsulating the creation logic within the Factory, the application can easily adapt to different product recommendation algorithms and strategies.



Data Flow Design
Book Search Component:x
Responsibilities:
Allow users to search for books based on various criteria.
Retrieve book information from the Firebase Realtime Database.
Display search results to the user.
Classes/Modules: Implements search functionality and interacts with the Firebase Realtime Database to retrieve book data. Presents the user interface for book search and displays search results.
Ratings & Reviews Component:
Responsibilities:
Enable users to rate and review books.
Store user ratings and reviews in the Firebase Realtime Database.
Display book ratings and reviews to users.
Classes/Modules: Handles rating and review submission and retrieval operations. Provides the user interface for rating and reviewing books.
Sentiment Analysis Component:
Responsibilities:
Analyze user reviews using a sentiment analysis model.
Determine the sentiment (positive/negative) expressed in reviews.
Categorize reviews based on sentiment for display purposes.
Classes/Modules: Performs sentiment analysis on user reviews using the trained TensorFlow model. Provides utility functions for sentiment analysis, such as text preprocessing and sentiment categorization.
User Interface Component:
Responsibilities:
Create visually appealing and intuitive user interfaces.
Handle user interactions and input validation.
Present data and information to the user in an organized manner.
Data Synchronization Component:
Responsibilities:
Ensure real-time synchronization of user data and book information with the Firebase Realtime Database.
Handle data retrieval, storage, and updates.
Manage data consistency and conflict resolution.
Classes/Modules: Provides methods to interact with the Firebase Realtime Database, including data retrieval and storage operations. Performs background synchronization tasks to keep the local data up to date.

Data Flow Diagram

Component Diagram








Sequence or WorkFlow
Book Search and Selection:
On the main screen, the user can search for books by entering keywords in the search bar.
The BookSearchManager component handles the search request and retrieves matching book information from the Firebase Realtime Database.
The search results are displayed in a list or grid format on the screen.
The user selects a book from the search results by tapping on it.
Book Details and Reviews:
The BookDetailsActivity displays detailed information about the selected book, including its title, author and cover image.
The application retrieves the book's ratings and reviews from the Firebase Realtime Database.
The ratings and reviews are displayed to the user on the screen.
The user has the option to provide their own rating and review for the book by tapping on the "Add Review" button.
The ReviewActivity is launched, allowing the user to enter their rating and review comments.
Sentiment Analysis and Categorization:
After the user submits their review, the SentimentAnalyzer component analyzes the sentiment expressed in the text using the trained TensorFlow model.
The sentiment analysis results in categorizing the review as positive or negative.
The categorized review is stored in the Firebase Realtime Database using the ReviewManager component.
The BookDetailsActivity is updated to display the new review along with the existing ratings and reviews.
User Profile and Favorites:
The user can access their profile by navigating to the user-specific section of the application.
The user can view their favorite books, which are stored locally using the LocalStorageManager component.
The user has the ability to add or remove books from their favorites list.
Data Synchronization:
The DataSyncService component continuously synchronizes user data and book information between the local storage and the Firebase Realtime Database.
When the device is online, the DataSyncService updates any local changes to the server and retrieves the latest data from the server to update the local storage.
If the device is offline, the LocalStorageManager stores any user actions or changes locally, and the OfflineDataHandler manages the synchronization once the device regains internet connectivity.
Sequence Diagram











Design Pattern
The BookReview application can adopt the Model-View-Controller (MVC) design pattern to effectively organize its components and improve code maintenance. Here's how MVC can be applied to the app:

The Model component will handle data management and storage by interacting with the Firebase Realtime Database. It will store and retrieve user reviews, book details, and other relevant data. Additionally, the Model will incorporate the sentiment analysis machine learning model to categorize the reviews. It will also include a data synchronization component to maintain consistency between local storage and the server.

The View component will be responsible for the user interface, encompassing activities, fragments, and layout files. It will present book details, review forms, summary calculations, and other visual elements to users. The View will display sentiment analysis results in an intuitive manner, reflecting positive or negative categorizations. It will communicate with the Model to fetch and update data as required.

The Controller component will act as a mediator between the Model and View. It will handle user input, process actions, and facilitate data flow between the Model and View. For instance, when a user submits a review, the Controller will receive the input, interact with the Model to store the review, and update the View accordingly. It will also manage other user interactions, such as marking books as favorites or retrieving review summaries, by coordinating actions between the Model and View.

Implementing the MVC design pattern in the BookReview app helps keep things organized and makes it easier to maintain the code. It allows developers to work on different parts of the app independently and test them separately. This promotes teamwork and collaboration. Moreover, the MVC structure makes it easier to add new features and make improvements to the app in the future. It provides flexibility and ensures that the app can grow and adapt as needed.




Model Engineering
Data Collection and Storage:
Utilize Firebase Realtime Database for storing and retrieving user reviews, book details, and related data.
Collect user reviews and securely store them in the database, including attributes like book ID, user ID, rating, comments, and sentiment analysis results.
Obtain book details from external sources or manually add them to the database.
Data Processing and Analysis:
Apply machine learning algorithms, leveraging TensorFlow, for sentiment analysis of user reviews.
Train the sentiment analysis model using a dataset of 50,000 IMDb movie reviews, which contains positive and negative sentiments.
Preprocess the reviews, convert them into numerical representations, and train a sequential model using TensorFlow for optimal performance.
Data Synchronization and Integrity:
Implement a Data Synchronization Component to ensure real-time synchronization between local storage and the Firebase Realtime Database.
Handle conflicts and resolve data inconsistencies during synchronization.
Enable offline access to data and automatically sync changes when the device reconnects to the internet.
Sentiment Analysis:
Utilize machine learning algorithms and natural language processing techniques to perform sentiment analysis on book reviews.
Categorize reviews into positive or negative sentiments for users to understand the overall sentiment towards a book.
Machine Learning Algorithms:
Use a dataset of 50,000 IMDb movie reviews to train the sentiment analysis model.
Employ TensorFlow to develop and train the sequential model.
Incorporate layers such as embedding, global average pooling 1D, and dense layers for sentiment classification.


Data Engineering
Data Collection and Storage:
BookReview utilizes Firebase Realtime Database as the primary data storage solution. It provides a scalable and efficient platform for storing and retrieving user reviews, book details, and other related data.
The application collects book reviews submitted by users and stores them securely in the Firebase Realtime Database. Each review consists of various attributes such as the book ID, user ID, rating, comments, and sentiment analysis results.
Additionally, book details and metadata are obtained from external sources or manually added to the database to provide comprehensive information for users.
Data Processing and Analysis:
BookReview incorporates machine learning algorithms for sentiment analysis of user reviews. TensorFlow, a popular machine learning framework, is utilized to train and deploy the sentiment analysis model.
The sentiment analysis model used in BookReview has been trained on a dataset consisting of 50,000 IMDb movie reviews. This dataset contains both positive and negative reviews, providing a diverse range of sentiments for training the model.
The training process involved preprocessing the IMDb movie reviews, converting them into numerical representations, and training the sequential model using the TensorFlow framework. The model was trained for 40 epochs to optimize its performance.
Data Synchronization and Integrity:
The Data Synchronization Component ensures real-time synchronization between the local storage on the device and the Firebase Realtime Database. This synchronization mechanism ensures that user reviews and book details are consistently updated and available across all devices.
The synchronization process handles conflicts and resolves data inconsistencies to maintain the integrity of the data. It provides a seamless user experience by enabling offline access to data and automatically syncing changes when the device reconnects to the internet.

 
Data Science Features Used  

Sentiment Analysis:
Sentiment analysis is a key data science feature implemented in BookReview. It involves analyzing the sentiment expressed in book reviews to determine whether they are positive or negative.
The application utilizes machine learning algorithms and natural language processing techniques to perform sentiment analysis on the text of user reviews.
By categorizing the reviews into positive or negative sentiments, users can quickly understand the overall sentiment towards a particular book. This feature helps users make informed decisions and provides valuable feedback to book developers.
Machine Learning Algorithms:
BookReview leverages machine learning algorithms to train models for sentiment analysis.
The application uses a dataset containing 50,000 IMDb movie reviews, consisting of both positive and negative sentiments, to train the sentiment analysis model.
TensorFlow, a popular machine learning framework, is utilized to develop and train the sequential model.
The model incorporates various layers, including an embedding layer, global average pooling 1D layer, and dense layers, to perform sentiment classification on the input text.


Local Storage

In BookReview, the functionality of marking books as favorites and writing reviews and ratings is implemented with local storage. This approach allows users to save their preferences and interactions directly on their devices. When a user marks a book as a favorite, the information is stored locally, ensuring that the user's favorite books are easily accessible even when offline. Similarly, when a user writes a review and provides a rating for a book, this data is saved locally on the device. This local storage mechanism enables users to compose reviews and rate books at their convenience and ensures that their feedback is captured securely. The locally saved reviews and ratings can later be synchronized with the Firebase Realtime Database when the device is connected to the internet, ensuring that the user's interactions are seamlessly integrated into the broader BookReview system.

Testing

Data Validation Testing
Input Validation:
The application validates user inputs to ensure they meet the required format and constraints.
Test cases were designed to verify that inputs such as book titles, review comments, and ratings are validated correctly.
Invalid inputs, such as empty fields or inputs exceeding the specified length, were tested to ensure appropriate error handling.
Data Integrity:
The application was tested to ensure that data stored in the Firebase Realtime Database is consistent and accurate.
Test scenarios included verifying that book details and user reviews are correctly stored and retrieved from the database.
The integrity of data relationships, such as linking book reviews to the corresponding books, was also validated.
Sentiment Analysis Blackbox Testing
Positive Sentiment Testing:
Test cases were designed to input book reviews with positive sentiments and verify that the sentiment analysis correctly classifies them as positive.
Various positive review scenarios, including different expressions of satisfaction and praise, were tested to evaluate the model's accuracy.
Negative Sentiment Testing:
Test cases were created to input book reviews with negative sentiments and confirm that the sentiment analysis accurately identifies them as negative.
Negative review scenarios, such as criticism, disappointment, or dissatisfaction, were tested to assess the model's performance.
Edge Cases:
The sentiment analysis model was subjected to edge cases, such as reviews with mixed sentiments, ambiguous statements, or sarcastic tones.
Test scenarios included challenging the model with borderline reviews to evaluate its ability to handle complex sentiments accurately.
General Black Box Testing
Navigation Testing:
The application's navigation flow was tested to ensure seamless transitions between different screens and functionalities.
Test scenarios included verifying the correctness of back buttons, navigation drawers, and menu options.
Functional Testing:
Various functionalities of the application, such as adding reviews, marking books as favorites, and viewing review summaries, were tested to ensure they function as intended.
Test cases were designed to cover different usage scenarios, input combinations, and edge cases to validate the correctness and reliability of the features.
Usability Testing:
Usability tests were conducted to evaluate the user-friendliness and intuitiveness of the application's interface.
Testers, including both experienced and novice users, interacted with the app to provide feedback on the ease of use, visual appeal, and overall satisfaction.
Compatibility Testing:
The application was tested on various Android devices with different screen sizes, resolutions, and operating system versions to ensure compatibility.
Test scenarios included verifying that the app functions correctly and renders appropriately across a range of devices.
Performance Testing:
Performance tests were conducted to assess the responsiveness and efficiency of the application under normal and peak load conditions.
The app's response time, resource utilization, and stability were evaluated to ensure a smooth and optimized user experience.


RESTFul Interfaces and Server-Side Design
The BookReview application follows a client-server architecture, where the client (Android smartphones) interacts with the server through RESTful interfaces. The application incorporates RESTful API design to facilitate seamless communication with external data sources. By following REST principles, BookReview ensures efficient and scalable interactions with external data sources, enabling the smooth retrieval and processing of relevant information. Firebase acts as the client, facilitating effective communication with the server. This client-server design promotes efficient data management, clear separation of concerns, flexibility in generating product recommendations, and seamless communication between the client and server components of the BookReview Android application.

Client Side Interfaces and Design

Work Distribution
Srinishaa Prabhakaram:
Back-end development and integration
Setting up the Firebase Realtime Database
Implementing database operations for user registration, login, book search, ratings, and reviews
Integrating the sentiment analysis model into the app
Ensuring smooth communication between the app and the database
Aishwarya Lodhi:
Front-end development
Implementing front-end functionalities
Developing activities and screens
Handling user input and interactions
Integrating UI components
Rishabh Gupta:
Mobile app UI/UX design
Designing visually appealing and user-friendly screens
Creating intuitive navigation flows
Ensuring consistent and cohesive design throughout the app
Collaborative tasks:
Integrating UI designs with front-end code
Testing app functionality and user experience
Optimizing app performance
Conclusion
In conclusion, the BookReview Android application is a feature-rich platform that utilizes machine learning techniques to provide valuable insights into book reviews. By leveraging natural language processing and sentiment analysis, the application categorizes reviews as positive or negative, allowing users to gauge the overall sentiment towards a particular book. The user interface is intuitive and visually appealing, facilitating easy input of reviews. The application follows Object-Oriented Programming principles, ensuring code reusability, maintenance, and program enhancement.

The architecture of BookReview adopts a data-centric approach, utilizing Firebase Realtime Database for efficient storage of user reviews. The application incorporates various classes and follows the Model-View-Controller (MVC) design pattern to separate concerns and manage data flow effectively. It leverages the Factory design pattern for dynamic instance creation, enhancing program flexibility. The client-server design ensures efficient data management, separation of concerns, and effective communication between the client and server components.

The implementation of BookReview involves several technologies and tools. The primary programming language used is Java, along with XML for designing the user interface. TensorFlow and TensorFlow Lite are employed for machine learning capabilities and sentiment classification. Android Studio serves as the development tool, and Firebase handles data storage. External libraries, such as Firebase ML SDKs and Firebase DB SDKs, are integrated to enable machine learning and database functionalities.

Overall, BookReview fulfills both functional and non-functional requirements, providing user registration, book search, ratings and reviews, sentiment analysis, book favorites, and an intuitive user interface. The application ensures performance, security, scalability, usability, reliability, and accessibility. The implementation follows the MVC design pattern, leveraging Firebase Realtime Database and machine learning algorithms for efficient data storage, synchronization, and sentiment analysis. With its comprehensive features and well-designed architecture, BookReview offers a valuable tool for book enthusiasts to explore and analyze reviews effectively.




References

https://www.guru99.com/black-box-testing.html 
https://developer.android.com/distribute/marketing-tools/identity/report-writing 
https://monkeylearn.com/sentiment-analysis/ 
https://en.wikipedia.org/wiki/Model_engineering 
https://www.agilemodeling.com/artifacts/dataFlowDiagram.htm 
https://www.uml-diagrams.org/sequence-diagrams.html 






