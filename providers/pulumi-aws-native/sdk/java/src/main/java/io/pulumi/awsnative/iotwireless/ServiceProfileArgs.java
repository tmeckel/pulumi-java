// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.iotwireless.inputs.ServiceProfileLoRaWANServiceProfileArgs;
import io.pulumi.awsnative.iotwireless.inputs.ServiceProfileTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceProfileArgs Empty = new ServiceProfileArgs();

    /**
     * LoRaWAN supports all LoRa specific attributes for service profile for CreateServiceProfile operation
     * 
     */
    @Import(name="loRaWAN")
      private final @Nullable Output<ServiceProfileLoRaWANServiceProfileArgs> loRaWAN;

    public Output<ServiceProfileLoRaWANServiceProfileArgs> getLoRaWAN() {
        return this.loRaWAN == null ? Codegen.empty() : this.loRaWAN;
    }

    /**
     * Name of service profile
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A list of key-value pairs that contain metadata for the service profile.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ServiceProfileTagArgs>> tags;

    public Output<List<ServiceProfileTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ServiceProfileArgs(
        @Nullable Output<ServiceProfileLoRaWANServiceProfileArgs> loRaWAN,
        @Nullable Output<String> name,
        @Nullable Output<List<ServiceProfileTagArgs>> tags) {
        this.loRaWAN = loRaWAN;
        this.name = name;
        this.tags = tags;
    }

    private ServiceProfileArgs() {
        this.loRaWAN = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceProfileLoRaWANServiceProfileArgs> loRaWAN;
        private @Nullable Output<String> name;
        private @Nullable Output<List<ServiceProfileTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loRaWAN = defaults.loRaWAN;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder loRaWAN(@Nullable Output<ServiceProfileLoRaWANServiceProfileArgs> loRaWAN) {
            this.loRaWAN = loRaWAN;
            return this;
        }
        public Builder loRaWAN(@Nullable ServiceProfileLoRaWANServiceProfileArgs loRaWAN) {
            this.loRaWAN = Codegen.ofNullable(loRaWAN);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<List<ServiceProfileTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ServiceProfileTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(ServiceProfileTagArgs... tags) {
            return tags(List.of(tags));
        }        public ServiceProfileArgs build() {
            return new ServiceProfileArgs(loRaWAN, name, tags);
        }
    }
}
