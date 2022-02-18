// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
 * 
 */
public final class ExternalProtectionLevelOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExternalProtectionLevelOptionsArgs Empty = new ExternalProtectionLevelOptionsArgs();

    /**
     * The path to the external key material on the EKM when using EkmConnection e.g., "v0/my/key". Set this field instead of external_key_uri when using an EkmConnection.
     * 
     */
    @InputImport(name="ekmConnectionKeyPath")
    private final @Nullable Input<String> ekmConnectionKeyPath;

    public Input<String> getEkmConnectionKeyPath() {
        return this.ekmConnectionKeyPath == null ? Input.empty() : this.ekmConnectionKeyPath;
    }

    /**
     * The URI for an external resource that this CryptoKeyVersion represents.
     * 
     */
    @InputImport(name="externalKeyUri")
    private final @Nullable Input<String> externalKeyUri;

    public Input<String> getExternalKeyUri() {
        return this.externalKeyUri == null ? Input.empty() : this.externalKeyUri;
    }

    public ExternalProtectionLevelOptionsArgs(
        @Nullable Input<String> ekmConnectionKeyPath,
        @Nullable Input<String> externalKeyUri) {
        this.ekmConnectionKeyPath = ekmConnectionKeyPath;
        this.externalKeyUri = externalKeyUri;
    }

    private ExternalProtectionLevelOptionsArgs() {
        this.ekmConnectionKeyPath = Input.empty();
        this.externalKeyUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalProtectionLevelOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ekmConnectionKeyPath;
        private @Nullable Input<String> externalKeyUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalProtectionLevelOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ekmConnectionKeyPath = defaults.ekmConnectionKeyPath;
    	      this.externalKeyUri = defaults.externalKeyUri;
        }

        public Builder setEkmConnectionKeyPath(@Nullable Input<String> ekmConnectionKeyPath) {
            this.ekmConnectionKeyPath = ekmConnectionKeyPath;
            return this;
        }

        public Builder setEkmConnectionKeyPath(@Nullable String ekmConnectionKeyPath) {
            this.ekmConnectionKeyPath = Input.ofNullable(ekmConnectionKeyPath);
            return this;
        }

        public Builder setExternalKeyUri(@Nullable Input<String> externalKeyUri) {
            this.externalKeyUri = externalKeyUri;
            return this;
        }

        public Builder setExternalKeyUri(@Nullable String externalKeyUri) {
            this.externalKeyUri = Input.ofNullable(externalKeyUri);
            return this;
        }

        public ExternalProtectionLevelOptionsArgs build() {
            return new ExternalProtectionLevelOptionsArgs(ekmConnectionKeyPath, externalKeyUri);
        }
    }
}
