CREATE DATABASE notifications;

CREATE TABLE notifications (
    id VARCHAR(100) NOT NULL PRIMARY KEY,
    userEmail(50) NOT NULL,
    videoName(200) NOT NULL,
    text VARCHAR(1000)
    
);

