package com.biblioteca.Biblioteca.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class ABaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "state", nullable = false)
    private Boolean state;

    @Schema(description = "Fecha de creación del dato", example = "")
    @Column(name = "created_at", nullable = true)
    private LocalDateTime createdAt;

    @Schema(description = "Fecha de actualización del dato", example = "")
    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;

    @Schema(description = "Fecha de eliminación del dato", example = "")
    @Column(name = "deleted_at", nullable = true)
    private LocalDateTime deletedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the state
     */
    public Boolean getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    /**
     * @return the createdAt
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the updatedAt
     */
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return the deletedAt
     */
    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    /**
     * @param deletedAt the deletedAt to set
     */
    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }
}