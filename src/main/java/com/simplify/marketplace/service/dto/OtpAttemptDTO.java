package com.simplify.marketplace.service.dto;

import com.simplify.marketplace.domain.enumeration.OtpStatus;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.simplify.marketplace.domain.OtpAttempt} entity.
 */
public class OtpAttemptDTO implements Serializable {

    private Long id;

    private String contextId;

    private Integer otp;

    private Boolean isActive;

    private OtpStatus status;

    private String ip;

    private String coookie;

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

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public OtpStatus getStatus() {
        return status;
    }

    public void setStatus(OtpStatus status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCoookie() {
        return coookie;
    }

    public void setCoookie(String coookie) {
        this.coookie = coookie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OtpAttemptDTO)) {
            return false;
        }

        OtpAttemptDTO otpAttemptDTO = (OtpAttemptDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, otpAttemptDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "OtpAttemptDTO{" +
            "id=" + getId() +
            ", contextId='" + getContextId() + "'" +
            ", otp=" + getOtp() +
            ", isActive='" + getIsActive() + "'" +
            ", status='" + getStatus() + "'" +
            ", ip='" + getIp() + "'" +
            ", coookie='" + getCoookie() + "'" +
            "}";
    }
}
