// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs();

    /**
     * Required. Bucket of the Cloud Storage object.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return Required. Bucket of the Cloud Storage object.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Generation number of the Cloud Storage object.
     * 
     */
    @Import(name="generation")
    private @Nullable Output<Integer> generation;

    /**
     * @return Generation number of the Cloud Storage object.
     * 
     */
    public Optional<Output<Integer>> generation() {
        return Optional.ofNullable(this.generation);
    }

    /**
     * Required. Name of the Cloud Storage object.
     * 
     */
    @Import(name="object", required=true)
    private Output<String> object;

    /**
     * @return Required. Name of the Cloud Storage object.
     * 
     */
    public Output<String> object() {
        return this.object;
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs() {}

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs $) {
        this.bucket = $.bucket;
        this.generation = $.generation;
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs();
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs defaults) {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket Required. Bucket of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket Required. Bucket of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param generation Generation number of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder generation(@Nullable Output<Integer> generation) {
            $.generation = generation;
            return this;
        }

        /**
         * @param generation Generation number of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder generation(Integer generation) {
            return generation(Output.of(generation));
        }

        /**
         * @param object Required. Name of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder object(Output<String> object) {
            $.object = object;
            return this;
        }

        /**
         * @param object Required. Name of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder object(String object) {
            return object(Output.of(object));
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.object = Objects.requireNonNull($.object, "expected parameter 'object' to be non-null");
            return $;
        }
    }

}
