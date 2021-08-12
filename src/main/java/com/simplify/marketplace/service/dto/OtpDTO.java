package com.simplify.marketplace.service.dto;

import com.simplify.marketplace.domain.enumeration.OtpStatus;
import com.simplify.marketplace.domain.enumeration.OtpType;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A DTO for the {@link com.simplify.marketplace.domain.Otp} entity.
 */
public class OtpDTO implements Serializable {

    private Long id;

    private String contextId;

    private Integer otp;

    private String email;

    private Boolean isActive;

    private Integer phone;

    private OtpType type;

    private LocalDate expiryTime;

    private OtpStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContextId() {
        return contextId;
    }

    public void setContextId(String contextId) {
        this.contextId = contextId;
    }

    public Integer getOtp() {
        return otp;
    }

    public void setOtp(Integer otp) {
        this.otp = otp;
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

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public OtpType getType() {
        return type;
    }

    public void setType(OtpType type) {
        this.type = type;
    }

    public LocalDate getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(LocalDate expiryTime) {
        this.expiryTime = expiryTime;
    }

    public OtpStatus getStatus() {
        return status;
    }

    public void setStatus(OtpStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OtpDTO)) {
            return false;
        }

        OtpDTO otpDTO = (OtpDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, otpDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "OtpDTO{" +
            "id=" + getId() +
            ", contextId='" + getContextId() + "'" +
            ", otp=" + getOtp() +
            ", email='" + getEmail() + "'" +
            ", isActive='" + getIsActive() + "'" +
            ", phone=" + getPhone() +
            ", type='" + getType() + "'" +
            ", expiryTime='" + getExpiryTime() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
}
