// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceExportConfigurationInfoResponse {
    private final @Nullable String storageAccountName;

    @OutputCustomType.Constructor({"storageAccountName"})
    private ServiceExportConfigurationInfoResponse(@Nullable String storageAccountName) {
        this.storageAccountName = storageAccountName;
    }

    public Optional<String> getStorageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceExportConfigurationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String storageAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceExportConfigurationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageAccountName = defaults.storageAccountName;
        }

        public Builder setStorageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }

        public ServiceExportConfigurationInfoResponse build() {
            return new ServiceExportConfigurationInfoResponse(storageAccountName);
        }
    }
}
