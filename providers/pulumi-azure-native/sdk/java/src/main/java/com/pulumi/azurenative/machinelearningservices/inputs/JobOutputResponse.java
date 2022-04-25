// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Job output definition container information on where to find job output/logs.
 * 
 */
public final class JobOutputResponse extends com.pulumi.resources.InvokeArgs {

    public static final JobOutputResponse Empty = new JobOutputResponse();

    /**
     * ARM ID of the datastore where the job logs and artifacts are stored, or null for the default container (&#34;azureml&#34;) in the workspace&#39;s storage account.
     * 
     */
    @Import(name="datastoreId", required=true)
    private String datastoreId;

    /**
     * @return ARM ID of the datastore where the job logs and artifacts are stored, or null for the default container (&#34;azureml&#34;) in the workspace&#39;s storage account.
     * 
     */
    public String datastoreId() {
        return this.datastoreId;
    }

    /**
     * Path within the datastore to the job logs and artifacts.
     * 
     */
    @Import(name="path", required=true)
    private String path;

    /**
     * @return Path within the datastore to the job logs and artifacts.
     * 
     */
    public String path() {
        return this.path;
    }

    private JobOutputResponse() {}

    private JobOutputResponse(JobOutputResponse $) {
        this.datastoreId = $.datastoreId;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobOutputResponse $;

        public Builder() {
            $ = new JobOutputResponse();
        }

        public Builder(JobOutputResponse defaults) {
            $ = new JobOutputResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param datastoreId ARM ID of the datastore where the job logs and artifacts are stored, or null for the default container (&#34;azureml&#34;) in the workspace&#39;s storage account.
         * 
         * @return builder
         * 
         */
        public Builder datastoreId(String datastoreId) {
            $.datastoreId = datastoreId;
            return this;
        }

        /**
         * @param path Path within the datastore to the job logs and artifacts.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            $.path = path;
            return this;
        }

        public JobOutputResponse build() {
            $.datastoreId = Objects.requireNonNull($.datastoreId, "expected parameter 'datastoreId' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
