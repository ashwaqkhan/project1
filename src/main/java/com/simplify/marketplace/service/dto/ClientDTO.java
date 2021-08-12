package com.simplify.marketplace.service.dto;

import com.simplify.marketplace.domain.enumeration.CompanyType;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A DTO for the {@link com.simplify.marketplace.domain.Client} entity.
 */
public class ClientDTO implements Serializable {

    private Long id;

    private String companyName;

    private String companyWebsite;

    private CompanyType companyType;

    private String primaryPhone;

    private Boolean isActive;

    private String description;

    private LocalDate startDate;

    private CustomUserDTO customUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public CompanyType getCompanyType() {
        return companyType;
    }

    public void setCompanyType(CompanyType companyType) {
        this.companyType = companyType;
    }

    public String getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(String primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
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
        if (!(o instanceof ClientDTO)) {
            return false;
        }

        ClientDTO clientDTO = (ClientDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, clientDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ClientDTO{" +
            "id=" + getId() +
            ", companyName='" + getCompanyName() + "'" +
            ", companyWebsite='" + getCompanyWebsite() + "'" +
            ", companyType='" + getCompanyType() + "'" +
            ", primaryPhone='" + getPrimaryPhone() + "'" +
            ", isActive='" + getIsActive() + "'" +
            ", description='" + getDescription() + "'" +
            ", startDate='" + getStartDate() + "'" +
            ", customUser=" + getCustomUser() +
            "}";
    }
}
