package ru.yandex.practicum.catsgram.model;

import lombok.Data;

@Data
@lombok.Getter
public class Image {
    private Long id;
    private long postId;
    private String originalFileName;
    private String filePath;



}
