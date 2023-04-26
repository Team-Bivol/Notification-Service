package com.example.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public Notification getNotificationById(int id) {
        return notificationRepository.findById(id).orElse(null);
    }

    public Notification saveNotification(Notification notification) {
        return notificationRepository.save(user);
    }

    public void deleteNotification(int id) {
        notificationRepository.deleteById(id);
    }
}
