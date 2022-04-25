// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs Empty = new PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs();

    /**
     * A url representing a file or path (no wildcards) in Cloud Storage. Example: `gs://[BUCKET_NAME]/dictionary.txt`
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return A url representing a file or path (no wildcards) in Cloud Storage. Example: `gs://[BUCKET_NAME]/dictionary.txt`
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    private PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs() {}

    private PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs(PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs $) {
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs();
        }

        public Builder(PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs defaults) {
            $ = new PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path A url representing a file or path (no wildcards) in Cloud Storage. Example: `gs://[BUCKET_NAME]/dictionary.txt`
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path A url representing a file or path (no wildcards) in Cloud Storage. Example: `gs://[BUCKET_NAME]/dictionary.txt`
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryCloudStoragePathArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
