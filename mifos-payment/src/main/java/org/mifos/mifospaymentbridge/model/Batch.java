/**
 * File: Batch.java
 * =========================================
 * This class models the mifos payment Batch
 * table in our database.
 * @author Vladimir Fomene
 **/

package org.mifos.mifospaymentbridge.model;

import org.joda.time.DateTime;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Batch")
public class Batch{

    //Creation of a new type for transaction direction
    private enum TransactionDirection{
        INBOUND, OUTBOUND
    }

    /**
     * table Fields of the Batch table
     */
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="batch_id")
    private Long id;

    @Column(name="mmp_id")
    private Long mmpId;

    @Column(name="mfi_id")
    private Long mfiId;

    @Column(name="transaction_direction")
    private TransactionDirection transact_direction;

    @Column(name="file_name")
    private String fileName;

    @Column(name="file_path")
    private String filePath;

    @Column(name="file_dtm")
    private Date fileDate;

    @Column(name="uploaded_by_id")
    private Long uploadedById;

    @Column(name="uploaded_dtm")
    private DateTime uploadedDate;

    @Column(name="last_updated_id")
    private Long lastUpdatedById;

    @Column(name="last_updated_dtm")
    private DateTime lastUpdatedDate;

    @Column(name="status_id")
    private Integer statusId;


    /**
     * Gets the id for the batch
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * sets the id of the batch
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the mmp's id
     * @return mmpId
     */
    public Long getMmpId() {
        return mmpId;
    }

    /**
     * Sets the mmp's id
     * @param mmpId
     */
    public void setMmpId(Long mmpId) {
        this.mmpId = mmpId;
    }

    /**
     * Gets the mfi's id
     * @return mfiId
     */
    public Long getMfiId() {
        return mfiId;
    }

    /**
     * Sets the mfi's id
     * @param mfiId
     */
    public void setMfiId(Long mfiId) {
        this.mfiId = mfiId;
    }

    /**
     * Gets the transaction direction
     * @return transact_direction
     */
    public TransactionDirection getTransact_direction() {
        return transact_direction;
    }

    /**
     * Sets the transaction direction of a transaction
     * @param transact_direction
     */
    public void setTransact_direction(TransactionDirection transact_direction) {
        this.transact_direction = transact_direction;
    }

    /**
     * Gets the batch file name
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the batch file name
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Gets the filepath of the batch file
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the filepath of the batch file
     * @param filePath
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Gets file date time month
     * @return fileDate
     */
    public DateTime getFileDate() {
        return fileDate;
    }

    /**
     * Sets file date time month
     * @param fileDate
     */
    public void setFileDate(DateTime fileDate) {
        this.fileDate = fileDate;
    }

    /**
     * Get id of user who uploaded the file
     * @return uploadedById
     */
    public Long getUploadedById() {
        return uploadedById;
    }

    /**
     * Set id of user who uploaded the file
     * @param uploadedById
     */
    public void setUploadedById(Long uploadedById) {
        this.uploadedById = uploadedById;
    }

    /**
     * Get date when file was uploaded.
     * @return uploadedDate;
     */
    public DateTime getUploadedDate() {
        return uploadedDate;
    }

    /**
     * Set date when file was uploaded.
     * @param uploadedDate
     */
    public void setUploadedDate(DateTime uploadedDate) {
        this.uploadedDate = uploadedDate;
    }

    /**
     * Get id of user who last updated this batch
     * @return
     */
    public Long getLastUpdatedById() {
        return lastUpdatedById;
    }

    /**
     * Set id of user who last updated this batch
     * @param lastUpdatedById
     */
    public void setLastUpdatedById(Long lastUpdatedById) {
        this.lastUpdatedById = lastUpdatedById;
    }

    /**
     * Gets last updated date
     * @return lastUpdatedDate
     */
    public DateTime getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * Set last updated date
     * @param lastUpdatedDate
     */
    public void setLastUpdatedDate(DateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * Gets the status of the batch operation
     * @return statusId
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * Sets the status of the batch operation
     * @param statusId
     */
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }
}