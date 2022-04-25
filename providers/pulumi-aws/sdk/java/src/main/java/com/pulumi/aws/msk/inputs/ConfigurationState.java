// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationState extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationState Empty = new ConfigurationState();

    /**
     * Amazon Resource Name (ARN) of the configuration.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the configuration.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Description of the configuration.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the configuration.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of Apache Kafka versions which can use this configuration.
     * 
     */
    @Import(name="kafkaVersions")
    private @Nullable Output<List<String>> kafkaVersions;

    /**
     * @return List of Apache Kafka versions which can use this configuration.
     * 
     */
    public Optional<Output<List<String>>> kafkaVersions() {
        return Optional.ofNullable(this.kafkaVersions);
    }

    /**
     * Latest revision of the configuration.
     * 
     */
    @Import(name="latestRevision")
    private @Nullable Output<Integer> latestRevision;

    /**
     * @return Latest revision of the configuration.
     * 
     */
    public Optional<Output<Integer>> latestRevision() {
        return Optional.ofNullable(this.latestRevision);
    }

    /**
     * Name of the configuration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the configuration.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
     * 
     */
    @Import(name="serverProperties")
    private @Nullable Output<String> serverProperties;

    /**
     * @return Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
     * 
     */
    public Optional<Output<String>> serverProperties() {
        return Optional.ofNullable(this.serverProperties);
    }

    private ConfigurationState() {}

    private ConfigurationState(ConfigurationState $) {
        this.arn = $.arn;
        this.description = $.description;
        this.kafkaVersions = $.kafkaVersions;
        this.latestRevision = $.latestRevision;
        this.name = $.name;
        this.serverProperties = $.serverProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationState $;

        public Builder() {
            $ = new ConfigurationState();
        }

        public Builder(ConfigurationState defaults) {
            $ = new ConfigurationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param description Description of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param kafkaVersions List of Apache Kafka versions which can use this configuration.
         * 
         * @return builder
         * 
         */
        public Builder kafkaVersions(@Nullable Output<List<String>> kafkaVersions) {
            $.kafkaVersions = kafkaVersions;
            return this;
        }

        /**
         * @param kafkaVersions List of Apache Kafka versions which can use this configuration.
         * 
         * @return builder
         * 
         */
        public Builder kafkaVersions(List<String> kafkaVersions) {
            return kafkaVersions(Output.of(kafkaVersions));
        }

        /**
         * @param kafkaVersions List of Apache Kafka versions which can use this configuration.
         * 
         * @return builder
         * 
         */
        public Builder kafkaVersions(String... kafkaVersions) {
            return kafkaVersions(List.of(kafkaVersions));
        }

        /**
         * @param latestRevision Latest revision of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder latestRevision(@Nullable Output<Integer> latestRevision) {
            $.latestRevision = latestRevision;
            return this;
        }

        /**
         * @param latestRevision Latest revision of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder latestRevision(Integer latestRevision) {
            return latestRevision(Output.of(latestRevision));
        }

        /**
         * @param name Name of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param serverProperties Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
         * 
         * @return builder
         * 
         */
        public Builder serverProperties(@Nullable Output<String> serverProperties) {
            $.serverProperties = serverProperties;
            return this;
        }

        /**
         * @param serverProperties Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
         * 
         * @return builder
         * 
         */
        public Builder serverProperties(String serverProperties) {
            return serverProperties(Output.of(serverProperties));
        }

        public ConfigurationState build() {
            return $;
        }
    }

}
