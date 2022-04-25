// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.file_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.file_v1.inputs.NfsExportOptionsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * File share configuration for the instance.
 * 
 */
public final class FileShareConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final FileShareConfigResponse Empty = new FileShareConfigResponse();

    /**
     * File share capacity in gigabytes (GB). Cloud Filestore defines 1 GB as 1024^3 bytes.
     * 
     */
    @Import(name="capacityGb", required=true)
    private String capacityGb;

    /**
     * @return File share capacity in gigabytes (GB). Cloud Filestore defines 1 GB as 1024^3 bytes.
     * 
     */
    public String capacityGb() {
        return this.capacityGb;
    }

    /**
     * The name of the file share (must be 16 characters or less).
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the file share (must be 16 characters or less).
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Nfs Export Options. There is a limit of 10 export options per file share.
     * 
     */
    @Import(name="nfsExportOptions", required=true)
    private List<NfsExportOptionsResponse> nfsExportOptions;

    /**
     * @return Nfs Export Options. There is a limit of 10 export options per file share.
     * 
     */
    public List<NfsExportOptionsResponse> nfsExportOptions() {
        return this.nfsExportOptions;
    }

    /**
     * The resource name of the backup, in the format `projects/{project_number}/locations/{location_id}/backups/{backup_id}`, that this file share has been restored from.
     * 
     */
    @Import(name="sourceBackup", required=true)
    private String sourceBackup;

    /**
     * @return The resource name of the backup, in the format `projects/{project_number}/locations/{location_id}/backups/{backup_id}`, that this file share has been restored from.
     * 
     */
    public String sourceBackup() {
        return this.sourceBackup;
    }

    private FileShareConfigResponse() {}

    private FileShareConfigResponse(FileShareConfigResponse $) {
        this.capacityGb = $.capacityGb;
        this.name = $.name;
        this.nfsExportOptions = $.nfsExportOptions;
        this.sourceBackup = $.sourceBackup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileShareConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileShareConfigResponse $;

        public Builder() {
            $ = new FileShareConfigResponse();
        }

        public Builder(FileShareConfigResponse defaults) {
            $ = new FileShareConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacityGb File share capacity in gigabytes (GB). Cloud Filestore defines 1 GB as 1024^3 bytes.
         * 
         * @return builder
         * 
         */
        public Builder capacityGb(String capacityGb) {
            $.capacityGb = capacityGb;
            return this;
        }

        /**
         * @param name The name of the file share (must be 16 characters or less).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param nfsExportOptions Nfs Export Options. There is a limit of 10 export options per file share.
         * 
         * @return builder
         * 
         */
        public Builder nfsExportOptions(List<NfsExportOptionsResponse> nfsExportOptions) {
            $.nfsExportOptions = nfsExportOptions;
            return this;
        }

        /**
         * @param nfsExportOptions Nfs Export Options. There is a limit of 10 export options per file share.
         * 
         * @return builder
         * 
         */
        public Builder nfsExportOptions(NfsExportOptionsResponse... nfsExportOptions) {
            return nfsExportOptions(List.of(nfsExportOptions));
        }

        /**
         * @param sourceBackup The resource name of the backup, in the format `projects/{project_number}/locations/{location_id}/backups/{backup_id}`, that this file share has been restored from.
         * 
         * @return builder
         * 
         */
        public Builder sourceBackup(String sourceBackup) {
            $.sourceBackup = sourceBackup;
            return this;
        }

        public FileShareConfigResponse build() {
            $.capacityGb = Objects.requireNonNull($.capacityGb, "expected parameter 'capacityGb' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.nfsExportOptions = Objects.requireNonNull($.nfsExportOptions, "expected parameter 'nfsExportOptions' to be non-null");
            $.sourceBackup = Objects.requireNonNull($.sourceBackup, "expected parameter 'sourceBackup' to be non-null");
            return $;
        }
    }

}
