package com.meetandcraft.api.post;

import com.meetandcraft.api.project.Project;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;
    private String content;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "projects_id")
    private Project project;
}
