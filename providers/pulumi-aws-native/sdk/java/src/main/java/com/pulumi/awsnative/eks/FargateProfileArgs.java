// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.eks;

import com.pulumi.awsnative.eks.inputs.FargateProfileSelectorArgs;
import com.pulumi.awsnative.eks.inputs.FargateProfileTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FargateProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final FargateProfileArgs Empty = new FargateProfileArgs();

    /**
     * Name of the Cluster
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return Name of the Cluster
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Name of FargateProfile
     * 
     */
    @Import(name="fargateProfileName")
    private @Nullable Output<String> fargateProfileName;

    /**
     * @return Name of FargateProfile
     * 
     */
    public Optional<Output<String>> fargateProfileName() {
        return Optional.ofNullable(this.fargateProfileName);
    }

    /**
     * The IAM policy arn for pods
     * 
     */
    @Import(name="podExecutionRoleArn", required=true)
    private Output<String> podExecutionRoleArn;

    /**
     * @return The IAM policy arn for pods
     * 
     */
    public Output<String> podExecutionRoleArn() {
        return this.podExecutionRoleArn;
    }

    @Import(name="selectors", required=true)
    private Output<List<FargateProfileSelectorArgs>> selectors;

    public Output<List<FargateProfileSelectorArgs>> selectors() {
        return this.selectors;
    }

    @Import(name="subnets")
    private @Nullable Output<List<String>> subnets;

    public Optional<Output<List<String>>> subnets() {
        return Optional.ofNullable(this.subnets);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<FargateProfileTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<FargateProfileTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private FargateProfileArgs() {}

    private FargateProfileArgs(FargateProfileArgs $) {
        this.clusterName = $.clusterName;
        this.fargateProfileName = $.fargateProfileName;
        this.podExecutionRoleArn = $.podExecutionRoleArn;
        this.selectors = $.selectors;
        this.subnets = $.subnets;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FargateProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FargateProfileArgs $;

        public Builder() {
            $ = new FargateProfileArgs();
        }

        public Builder(FargateProfileArgs defaults) {
            $ = new FargateProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Name of the Cluster
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Name of the Cluster
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param fargateProfileName Name of FargateProfile
         * 
         * @return builder
         * 
         */
        public Builder fargateProfileName(@Nullable Output<String> fargateProfileName) {
            $.fargateProfileName = fargateProfileName;
            return this;
        }

        /**
         * @param fargateProfileName Name of FargateProfile
         * 
         * @return builder
         * 
         */
        public Builder fargateProfileName(String fargateProfileName) {
            return fargateProfileName(Output.of(fargateProfileName));
        }

        /**
         * @param podExecutionRoleArn The IAM policy arn for pods
         * 
         * @return builder
         * 
         */
        public Builder podExecutionRoleArn(Output<String> podExecutionRoleArn) {
            $.podExecutionRoleArn = podExecutionRoleArn;
            return this;
        }

        /**
         * @param podExecutionRoleArn The IAM policy arn for pods
         * 
         * @return builder
         * 
         */
        public Builder podExecutionRoleArn(String podExecutionRoleArn) {
            return podExecutionRoleArn(Output.of(podExecutionRoleArn));
        }

        public Builder selectors(Output<List<FargateProfileSelectorArgs>> selectors) {
            $.selectors = selectors;
            return this;
        }

        public Builder selectors(List<FargateProfileSelectorArgs> selectors) {
            return selectors(Output.of(selectors));
        }

        public Builder selectors(FargateProfileSelectorArgs... selectors) {
            return selectors(List.of(selectors));
        }

        public Builder subnets(@Nullable Output<List<String>> subnets) {
            $.subnets = subnets;
            return this;
        }

        public Builder subnets(List<String> subnets) {
            return subnets(Output.of(subnets));
        }

        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<FargateProfileTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<FargateProfileTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(FargateProfileTagArgs... tags) {
            return tags(List.of(tags));
        }

        public FargateProfileArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.podExecutionRoleArn = Objects.requireNonNull($.podExecutionRoleArn, "expected parameter 'podExecutionRoleArn' to be non-null");
            $.selectors = Objects.requireNonNull($.selectors, "expected parameter 'selectors' to be non-null");
            return $;
        }
    }

}
