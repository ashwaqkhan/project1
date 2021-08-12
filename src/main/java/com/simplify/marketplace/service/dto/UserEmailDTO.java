package com.simplify.marketplace.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.simplify.marketplace.domain.UserEmail} entity.
 */
public class UserEmailDTO implements Serializable {

    private Long id;

    @NotNull
    @Pattern(regexp = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")
    private String email;

    private Boolean isActive;

    private Boolean isPrimary;

    private String tag;

    private CustomUserDTO customUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public CustomUserDTO getCustomUser() {
        return customUser;
    }

    public void setCustomUser(CustomUserDTO customUser) {
        this.customUser = customUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserEmailDTO)) {
            return false;
        }

        UserEmailDTO userEmailDTO = (UserEmailDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, userEmailDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "UserEmailDTO{" +
            "id=" + getId() +
            ", email='" + getEmail() + "'" +
            ", isActive='" + getIsActive() + "'" +
            ", isPrimary='" + getIsPrimary() + "'" +
            ", tag='" + getTag() + "'" +
            ", customUser=" + getCustomUser() +
            "}";
    }
}
