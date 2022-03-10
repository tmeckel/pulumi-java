// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationArgs Empty = new ConfigurationArgs();

    /**
     * Description of the configuration.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * List of Apache Kafka versions which can use this configuration.
     * 
     */
    @InputImport(name="kafkaVersions")
      private final @Nullable Input<List<String>> kafkaVersions;

    public Input<List<String>> getKafkaVersions() {
        return this.kafkaVersions == null ? Input.empty() : this.kafkaVersions;
    }

    /**
     * Name of the configuration.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
     * 
     */
    @InputImport(name="serverProperties", required=true)
      private final Input<String> serverProperties;

    public Input<String> getServerProperties() {
        return this.serverProperties;
    }

    public ConfigurationArgs(
        @Nullable Input<String> description,
        @Nullable Input<List<String>> kafkaVersions,
        @Nullable Input<String> name,
        Input<String> serverProperties) {
        this.description = description;
        this.kafkaVersions = kafkaVersions;
        this.name = name;
        this.serverProperties = Objects.requireNonNull(serverProperties, "expected parameter 'serverProperties' to be non-null");
    }

    private ConfigurationArgs() {
        this.description = Input.empty();
        this.kafkaVersions = Input.empty();
        this.name = Input.empty();
        this.serverProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> kafkaVersions;
        private @Nullable Input<String> name;
        private Input<String> serverProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.kafkaVersions = defaults.kafkaVersions;
    	      this.name = defaults.name;
    	      this.serverProperties = defaults.serverProperties;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder kafkaVersions(@Nullable Input<List<String>> kafkaVersions) {
            this.kafkaVersions = kafkaVersions;
            return this;
        }

        public Builder kafkaVersions(@Nullable List<String> kafkaVersions) {
            this.kafkaVersions = Input.ofNullable(kafkaVersions);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder serverProperties(Input<String> serverProperties) {
            this.serverProperties = Objects.requireNonNull(serverProperties);
            return this;
        }

        public Builder serverProperties(String serverProperties) {
            this.serverProperties = Input.of(Objects.requireNonNull(serverProperties));
            return this;
        }
        public ConfigurationArgs build() {
            return new ConfigurationArgs(description, kafkaVersions, name, serverProperties);
        }
    }
}
