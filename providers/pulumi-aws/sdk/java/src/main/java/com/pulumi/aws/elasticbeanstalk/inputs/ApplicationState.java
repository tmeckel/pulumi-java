// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticbeanstalk.inputs;

import com.pulumi.aws.elasticbeanstalk.inputs.ApplicationAppversionLifecycleGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationState extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationState Empty = new ApplicationState();

    @Import(name="appversionLifecycle")
    private @Nullable Output<ApplicationAppversionLifecycleGetArgs> appversionLifecycle;

    public Optional<Output<ApplicationAppversionLifecycleGetArgs>> appversionLifecycle() {
        return Optional.ofNullable(this.appversionLifecycle);
    }

    /**
     * The ARN assigned by AWS for this Elastic Beanstalk Application.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN assigned by AWS for this Elastic Beanstalk Application.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Short description of the application
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Short description of the application
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the application, must be unique within your account
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the application, must be unique within your account
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Key-value map of tags for the Elastic Beanstalk Application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of tags for the Elastic Beanstalk Application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private ApplicationState() {}

    private ApplicationState(ApplicationState $) {
        this.appversionLifecycle = $.appversionLifecycle;
        this.arn = $.arn;
        this.description = $.description;
        this.name = $.name;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationState $;

        public Builder() {
            $ = new ApplicationState();
        }

        public Builder(ApplicationState defaults) {
            $ = new ApplicationState(Objects.requireNonNull(defaults));
        }

        public Builder appversionLifecycle(@Nullable Output<ApplicationAppversionLifecycleGetArgs> appversionLifecycle) {
            $.appversionLifecycle = appversionLifecycle;
            return this;
        }

        public Builder appversionLifecycle(ApplicationAppversionLifecycleGetArgs appversionLifecycle) {
            return appversionLifecycle(Output.of(appversionLifecycle));
        }

        /**
         * @param arn The ARN assigned by AWS for this Elastic Beanstalk Application.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN assigned by AWS for this Elastic Beanstalk Application.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param description Short description of the application
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Short description of the application
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the application, must be unique within your account
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the application, must be unique within your account
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Key-value map of tags for the Elastic Beanstalk Application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of tags for the Elastic Beanstalk Application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public ApplicationState build() {
            return $;
        }
    }

}
