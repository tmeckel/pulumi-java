// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticbeanstalk;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationVersionArgs Empty = new ApplicationVersionArgs();

    /**
     * Name of the Beanstalk Application the version is associated with.
     * 
     */
    @Import(name="application", required=true)
    private Output<String> application;

    /**
     * @return Name of the Beanstalk Application the version is associated with.
     * 
     */
    public Output<String> application() {
        return this.application;
    }

    /**
     * S3 bucket that contains the Application Version source bundle.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return S3 bucket that contains the Application Version source bundle.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Short description of the Application Version.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Short description of the Application Version.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * On delete, force an Application Version to be deleted when it may be in use by multiple Elastic Beanstalk Environments.
     * 
     */
    @Import(name="forceDelete")
    private @Nullable Output<Boolean> forceDelete;

    /**
     * @return On delete, force an Application Version to be deleted when it may be in use by multiple Elastic Beanstalk Environments.
     * 
     */
    public Optional<Output<Boolean>> forceDelete() {
        return Optional.ofNullable(this.forceDelete);
    }

    /**
     * S3 object that is the Application Version source bundle.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return S3 object that is the Application Version source bundle.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Unique name for the this Application Version.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique name for the this Application Version.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Key-value map of tags for the Elastic Beanstalk Application Version. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of tags for the Elastic Beanstalk Application Version. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ApplicationVersionArgs() {}

    private ApplicationVersionArgs(ApplicationVersionArgs $) {
        this.application = $.application;
        this.bucket = $.bucket;
        this.description = $.description;
        this.forceDelete = $.forceDelete;
        this.key = $.key;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationVersionArgs $;

        public Builder() {
            $ = new ApplicationVersionArgs();
        }

        public Builder(ApplicationVersionArgs defaults) {
            $ = new ApplicationVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param application Name of the Beanstalk Application the version is associated with.
         * 
         * @return builder
         * 
         */
        public Builder application(Output<String> application) {
            $.application = application;
            return this;
        }

        /**
         * @param application Name of the Beanstalk Application the version is associated with.
         * 
         * @return builder
         * 
         */
        public Builder application(String application) {
            return application(Output.of(application));
        }

        /**
         * @param bucket S3 bucket that contains the Application Version source bundle.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket S3 bucket that contains the Application Version source bundle.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param description Short description of the Application Version.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Short description of the Application Version.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param forceDelete On delete, force an Application Version to be deleted when it may be in use by multiple Elastic Beanstalk Environments.
         * 
         * @return builder
         * 
         */
        public Builder forceDelete(@Nullable Output<Boolean> forceDelete) {
            $.forceDelete = forceDelete;
            return this;
        }

        /**
         * @param forceDelete On delete, force an Application Version to be deleted when it may be in use by multiple Elastic Beanstalk Environments.
         * 
         * @return builder
         * 
         */
        public Builder forceDelete(Boolean forceDelete) {
            return forceDelete(Output.of(forceDelete));
        }

        /**
         * @param key S3 object that is the Application Version source bundle.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key S3 object that is the Application Version source bundle.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name Unique name for the this Application Version.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique name for the this Application Version.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Key-value map of tags for the Elastic Beanstalk Application Version. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of tags for the Elastic Beanstalk Application Version. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ApplicationVersionArgs build() {
            $.application = Objects.requireNonNull($.application, "expected parameter 'application' to be non-null");
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
