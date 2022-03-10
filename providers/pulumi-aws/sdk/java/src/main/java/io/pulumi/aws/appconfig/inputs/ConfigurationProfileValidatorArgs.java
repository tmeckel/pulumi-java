// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationProfileValidatorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationProfileValidatorArgs Empty = new ConfigurationProfileValidatorArgs();

    /**
     * Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
     * 
     */
    @InputImport(name="content")
      private final @Nullable Input<String> content;

    public Input<String> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    /**
     * The type of validator. Valid values: `JSON_SCHEMA` and `LAMBDA`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ConfigurationProfileValidatorArgs(
        @Nullable Input<String> content,
        Input<String> type) {
        this.content = content;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ConfigurationProfileValidatorArgs() {
        this.content = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfileValidatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> content;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfileValidatorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.type = defaults.type;
        }

        public Builder content(@Nullable Input<String> content) {
            this.content = content;
            return this;
        }

        public Builder content(@Nullable String content) {
            this.content = Input.ofNullable(content);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ConfigurationProfileValidatorArgs build() {
            return new ConfigurationProfileValidatorArgs(content, type);
        }
    }
}
