package com.simplify.marketplace.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.simplify.marketplace.domain.UserPhone} entity.
 */
public class UserPhoneDTO implements Serializable {

    private Long id;

    private String phone;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        if (!(o instanceof UserPhoneDTO)) {
            return false;
        }

        UserPhoneDTO userPhoneDTO = (UserPhoneDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, userPhoneDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "UserPhoneDTO{" +
            "id=" + getId() +
            ", phone='" + getPhone() + "'" +
            ", isActive='" + getIsActive() + "'" +
            ", isPrimary='" + getIsPrimary() + "'" +
            ", tag='" + getTag() + "'" +
            ", customUser=" + getCustomUser() +
            "}";
    }
}
