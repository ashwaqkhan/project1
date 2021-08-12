package com.simplify.marketplace.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A UserEmail.
 */
@Entity
@Table(name = "user_email")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class UserEmail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Pattern(regexp = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")
    @Column(name = "email", nullable = false)
    private String email;

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

    public UserEmail id(Long id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public UserEmail email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public UserEmail isActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsPrimary() {
        return this.isPrimary;
    }

    public UserEmail isPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getTag() {
        return this.tag;
    }

    public UserEmail tag(String tag) {
        this.tag = tag;
        return this;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public CustomUser getCustomUser() {
        return this.customUser;
    }

    public UserEmail customUser(CustomUser customUser) {
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
        if (!(o instanceof UserEmail)) {
            return false;
        }
        return id != null && id.equals(((UserEmail) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "UserEmail{" +
            "id=" + getId() +
            ", email='" + getEmail() + "'" +
            ", isActive='" + getIsActive() + "'" +
            ", isPrimary='" + getIsPrimary() + "'" +
            ", tag='" + getTag() + "'" +
            "}";
    }
}
