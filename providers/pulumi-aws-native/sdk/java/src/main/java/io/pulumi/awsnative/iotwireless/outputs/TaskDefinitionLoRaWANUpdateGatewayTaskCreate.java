// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.awsnative.iotwireless.outputs.TaskDefinitionLoRaWANGatewayVersion;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskDefinitionLoRaWANUpdateGatewayTaskCreate {
    private final @Nullable TaskDefinitionLoRaWANGatewayVersion currentVersion;
    private final @Nullable Integer sigKeyCrc;
    private final @Nullable String updateSignature;
    private final @Nullable TaskDefinitionLoRaWANGatewayVersion updateVersion;

    @OutputCustomType.Constructor
    private TaskDefinitionLoRaWANUpdateGatewayTaskCreate(
        @OutputCustomType.Parameter("currentVersion") @Nullable TaskDefinitionLoRaWANGatewayVersion currentVersion,
        @OutputCustomType.Parameter("sigKeyCrc") @Nullable Integer sigKeyCrc,
        @OutputCustomType.Parameter("updateSignature") @Nullable String updateSignature,
        @OutputCustomType.Parameter("updateVersion") @Nullable TaskDefinitionLoRaWANGatewayVersion updateVersion) {
        this.currentVersion = currentVersion;
        this.sigKeyCrc = sigKeyCrc;
        this.updateSignature = updateSignature;
        this.updateVersion = updateVersion;
    }

    public Optional<TaskDefinitionLoRaWANGatewayVersion> getCurrentVersion() {
        return Optional.ofNullable(this.currentVersion);
    }
    public Optional<Integer> getSigKeyCrc() {
        return Optional.ofNullable(this.sigKeyCrc);
    }
    public Optional<String> getUpdateSignature() {
        return Optional.ofNullable(this.updateSignature);
    }
    public Optional<TaskDefinitionLoRaWANGatewayVersion> getUpdateVersion() {
        return Optional.ofNullable(this.updateVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionLoRaWANUpdateGatewayTaskCreate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TaskDefinitionLoRaWANGatewayVersion currentVersion;
        private @Nullable Integer sigKeyCrc;
        private @Nullable String updateSignature;
        private @Nullable TaskDefinitionLoRaWANGatewayVersion updateVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionLoRaWANUpdateGatewayTaskCreate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentVersion = defaults.currentVersion;
    	      this.sigKeyCrc = defaults.sigKeyCrc;
    	      this.updateSignature = defaults.updateSignature;
    	      this.updateVersion = defaults.updateVersion;
        }

        public Builder currentVersion(@Nullable TaskDefinitionLoRaWANGatewayVersion currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        public Builder sigKeyCrc(@Nullable Integer sigKeyCrc) {
            this.sigKeyCrc = sigKeyCrc;
            return this;
        }

        public Builder updateSignature(@Nullable String updateSignature) {
            this.updateSignature = updateSignature;
            return this;
        }

        public Builder updateVersion(@Nullable TaskDefinitionLoRaWANGatewayVersion updateVersion) {
            this.updateVersion = updateVersion;
            return this;
        }
        public TaskDefinitionLoRaWANUpdateGatewayTaskCreate build() {
            return new TaskDefinitionLoRaWANUpdateGatewayTaskCreate(currentVersion, sigKeyCrc, updateSignature, updateVersion);
        }
    }
}
