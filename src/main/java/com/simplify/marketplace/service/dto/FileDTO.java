package com.simplify.marketplace.service.dto;

import com.simplify.marketplace.domain.enumeration.FileFormat;
import com.simplify.marketplace.domain.enumeration.FileType;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.simplify.marketplace.domain.File} entity.
 */
public class FileDTO implements Serializable {

    private Long id;

    private String path;

    private FileFormat fileformat;

    private FileType filetype;

    private String tag;

    private Boolean isDefault;

    private Boolean isResume;

    private Boolean isProfilePic;

    private WorkerDTO worker;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public FileFormat getFileformat() {
        return fileformat;
    }

    public void setFileformat(FileFormat fileformat) {
        this.fileformat = fileformat;
    }

    public FileType getFiletype() {
        return filetype;
    }

    public void setFiletype(FileType filetype) {
        this.filetype = filetype;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getIsResume() {
        return isResume;
    }

    public void setIsResume(Boolean isResume) {
        this.isResume = isResume;
    }

    public Boolean getIsProfilePic() {
        return isProfilePic;
    }

    public void setIsProfilePic(Boolean isProfilePic) {
        this.isProfilePic = isProfilePic;
    }

    public WorkerDTO getWorker() {
        return worker;
    }

    public void setWorker(WorkerDTO worker) {
        this.worker = worker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileDTO)) {
            return false;
        }

        FileDTO fileDTO = (FileDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, fileDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "FileDTO{" +
            "id=" + getId() +
            ", path='" + getPath() + "'" +
            ", fileformat='" + getFileformat() + "'" +
            ", filetype='" + getFiletype() + "'" +
            ", tag='" + getTag() + "'" +
            ", isDefault='" + getIsDefault() + "'" +
            ", isResume='" + getIsResume() + "'" +
            ", isProfilePic='" + getIsProfilePic() + "'" +
            ", worker=" + getWorker() +
            "}";
    }
}
