package com.simplify.marketplace.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A UserPhone.
 */
@Entity
@Table(name = "user_phone")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class UserPhone implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone")
    private String phone;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "is_primary")
    private Boolean isPrimary;

    @Column(name = "tag")
    private String tag;

    @ManyToOne
    @JsonIgnoreProperties(value = { "userEmails", "userPhones", "addresses" }, allowSetters = true)
    private CustomUser customUser;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserPhone id(Long id) {
        this.id = id;
        return this;
    }

    public String getPhone() {
        return this.phone;
    }

    public UserPhone phone(String phone) {
        this.phone = phone;
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public UserPhone isActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsPrimary() {
        return this.isPrimary;
    }

    public UserPhone isPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getTag() {
        return this.tag;
    }

    public UserPhone tag(String tag) {
        this.tag = tag;
        return this;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public CustomUser getCustomUser() {
        return this.customUser;
    }

    public UserPhone customUser(CustomUser customUser) {
        this.setCustomUser(customUser);
        return this;
    }

    public void setCustomUser(CustomUser customUser) {
        this.customUser = customUser;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserPhone)) {
            return false;
        }
        return id != null && id.equals(((UserPhone) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "UserPhone{" +
            "id=" + getId() +
            ", phone='" + getPhone() + "'" +
            ", isActive='" + getIsActive() + "'" +
            ", isPrimary='" + getIsPrimary() + "'" +
            ", tag='" + getTag() + "'" +
            "}";
    }
}
