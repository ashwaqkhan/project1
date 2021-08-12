package com.simplify.marketplace.domain;

import com.simplify.marketplace.domain.enumeration.OtpStatus;
import com.simplify.marketplace.domain.enumeration.OtpType;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Otp.
 */
@Entity
@Table(name = "otp")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Otp implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "context_id")
    private String contextId;

    @Column(name = "otp")
    private Integer otp;

    @Column(name = "email")
    private String email;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "phone")
    private Integer phone;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private OtpType type;

    @Column(name = "expiry_time")
    private LocalDate expiryTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private OtpStatus status;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Otp id(Long id) {
        this.id = id;
        return this;
    }

    public String getContextId() {
        return this.contextId;
    }

    public Otp contextId(String contextId) {
        this.contextId = contextId;
        return this;
    }

    public void setContextId(String contextId) {
        this.contextId = contextId;
    }

    public Integer getOtp() {
        return this.otp;
    }

    public Otp otp(Integer otp) {
        this.otp = otp;
        return this;
    }

    public void setOtp(Integer otp) {
        this.otp = otp;
    }

    public String getEmail() {
        return this.email;
    }

    public Otp email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public Otp isActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getPhone() {
        return this.phone;
    }

    public Otp phone(Integer phone) {
        this.phone = phone;
        return this;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public OtpType getType() {
        return this.type;
    }

    public Otp type(OtpType type) {
        this.type = type;
        return this;
    }

    public void setType(OtpType type) {
        this.type = type;
    }

    public LocalDate getExpiryTime() {
        return this.expiryTime;
    }

    public Otp expiryTime(LocalDate expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    public void setExpiryTime(LocalDate expiryTime) {
        this.expiryTime = expiryTime;
    }

    public OtpStatus getStatus() {
        return this.status;
    }

    public Otp status(OtpStatus status) {
        this.status = status;
        return this;
    }

    public void setStatus(OtpStatus status) {
        this.status = status;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Otp)) {
            return false;
        }
        return id != null && id.equals(((Otp) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Otp{" +
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
