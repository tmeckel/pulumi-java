// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectSourceBuildStatusConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectSourceBuildStatusConfigArgs Empty = new ProjectSourceBuildStatusConfigArgs();

    /**
     * Specifies the context of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
     * 
     */
    @Import(name="context")
    private @Nullable Output<String> context;

    /**
     * @return Specifies the context of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
     * 
     */
    public Optional<Output<String>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
     * 
     */
    @Import(name="targetUrl")
    private @Nullable Output<String> targetUrl;

    /**
     * @return Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
     * 
     */
    public Optional<Output<String>> targetUrl() {
        return Optional.ofNullable(this.targetUrl);
    }

    private ProjectSourceBuildStatusConfigArgs() {}

    private ProjectSourceBuildStatusConfigArgs(ProjectSourceBuildStatusConfigArgs $) {
        this.context = $.context;
        this.targetUrl = $.targetUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectSourceBuildStatusConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectSourceBuildStatusConfigArgs $;

        public Builder() {
            $ = new ProjectSourceBuildStatusConfigArgs();
        }

        public Builder(ProjectSourceBuildStatusConfigArgs defaults) {
            $ = new ProjectSourceBuildStatusConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param context Specifies the context of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable Output<String> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context Specifies the context of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
         * 
         * @return builder
         * 
         */
        public Builder context(String context) {
            return context(Output.of(context));
        }

        /**
         * @param targetUrl Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
         * 
         * @return builder
         * 
         */
        public Builder targetUrl(@Nullable Output<String> targetUrl) {
            $.targetUrl = targetUrl;
            return this;
        }

        /**
         * @param targetUrl Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
         * 
         * @return builder
         * 
         */
        public Builder targetUrl(String targetUrl) {
            return targetUrl(Output.of(targetUrl));
        }

        public ProjectSourceBuildStatusConfigArgs build() {
            return $;
        }
    }

}
