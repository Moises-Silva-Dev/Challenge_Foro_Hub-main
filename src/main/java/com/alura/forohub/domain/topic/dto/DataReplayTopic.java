package com.alura.forohub.domain.topic.dto;


public record DataReplayTopic(Long id,
                              String title,
                              String message,
                              String timestamp,
                              boolean status,
                              String course,
                              String author,
                              String updated) {
}
