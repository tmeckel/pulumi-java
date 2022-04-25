// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Copy Log Details for a disk
 * 
 */
public final class DataBoxDiskCopyLogDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DataBoxDiskCopyLogDetailsResponse Empty = new DataBoxDiskCopyLogDetailsResponse();

    /**
     * Indicates the type of job details.
     * Expected value is &#39;DataBoxDisk&#39;.
     * 
     */
    @Import(name="copyLogDetailsType", required=true)
    private String copyLogDetailsType;

    /**
     * @return Indicates the type of job details.
     * Expected value is &#39;DataBoxDisk&#39;.
     * 
     */
    public String copyLogDetailsType() {
        return this.copyLogDetailsType;
    }

    /**
     * Disk Serial Number.
     * 
     */
    @Import(name="diskSerialNumber", required=true)
    private String diskSerialNumber;

    /**
     * @return Disk Serial Number.
     * 
     */
    public String diskSerialNumber() {
        return this.diskSerialNumber;
    }

    /**
     * Link for copy error logs.
     * 
     */
    @Import(name="errorLogLink", required=true)
    private String errorLogLink;

    /**
     * @return Link for copy error logs.
     * 
     */
    public String errorLogLink() {
        return this.errorLogLink;
    }

    /**
     * Link for copy verbose logs.
     * 
     */
    @Import(name="verboseLogLink", required=true)
    private String verboseLogLink;

    /**
     * @return Link for copy verbose logs.
     * 
     */
    public String verboseLogLink() {
        return this.verboseLogLink;
    }

    private DataBoxDiskCopyLogDetailsResponse() {}

    private DataBoxDiskCopyLogDetailsResponse(DataBoxDiskCopyLogDetailsResponse $) {
        this.copyLogDetailsType = $.copyLogDetailsType;
        this.diskSerialNumber = $.diskSerialNumber;
        this.errorLogLink = $.errorLogLink;
        this.verboseLogLink = $.verboseLogLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataBoxDiskCopyLogDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataBoxDiskCopyLogDetailsResponse $;

        public Builder() {
            $ = new DataBoxDiskCopyLogDetailsResponse();
        }

        public Builder(DataBoxDiskCopyLogDetailsResponse defaults) {
            $ = new DataBoxDiskCopyLogDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param copyLogDetailsType Indicates the type of job details.
         * Expected value is &#39;DataBoxDisk&#39;.
         * 
         * @return builder
         * 
         */
        public Builder copyLogDetailsType(String copyLogDetailsType) {
            $.copyLogDetailsType = copyLogDetailsType;
            return this;
        }

        /**
         * @param diskSerialNumber Disk Serial Number.
         * 
         * @return builder
         * 
         */
        public Builder diskSerialNumber(String diskSerialNumber) {
            $.diskSerialNumber = diskSerialNumber;
            return this;
        }

        /**
         * @param errorLogLink Link for copy error logs.
         * 
         * @return builder
         * 
         */
        public Builder errorLogLink(String errorLogLink) {
            $.errorLogLink = errorLogLink;
            return this;
        }

        /**
         * @param verboseLogLink Link for copy verbose logs.
         * 
         * @return builder
         * 
         */
        public Builder verboseLogLink(String verboseLogLink) {
            $.verboseLogLink = verboseLogLink;
            return this;
        }

        public DataBoxDiskCopyLogDetailsResponse build() {
            $.copyLogDetailsType = Codegen.stringProp("copyLogDetailsType").arg($.copyLogDetailsType).require();
            $.diskSerialNumber = Objects.requireNonNull($.diskSerialNumber, "expected parameter 'diskSerialNumber' to be non-null");
            $.errorLogLink = Objects.requireNonNull($.errorLogLink, "expected parameter 'errorLogLink' to be non-null");
            $.verboseLogLink = Objects.requireNonNull($.verboseLogLink, "expected parameter 'verboseLogLink' to be non-null");
            return $;
        }
    }

}
