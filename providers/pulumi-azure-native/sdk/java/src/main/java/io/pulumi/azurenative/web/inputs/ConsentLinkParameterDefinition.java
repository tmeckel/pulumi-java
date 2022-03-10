// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Consent link definition
 * 
 */
public final class ConsentLinkParameterDefinition extends io.pulumi.resources.InvokeArgs {

    public static final ConsentLinkParameterDefinition Empty = new ConsentLinkParameterDefinition();

    /**
     * AAD OID (user or group) if the principal type is ActiveDirectory. MSA PUID if the principal type is MicrosoftAccount
     * 
     */
    @InputImport(name="objectId")
      private final @Nullable String objectId;

    public Optional<String> getObjectId() {
        return this.objectId == null ? Optional.empty() : Optional.ofNullable(this.objectId);
    }

    /**
     * Name of the parameter in the connection provider's OAuth settings
     * 
     */
    @InputImport(name="parameterName")
      private final @Nullable String parameterName;

    public Optional<String> getParameterName() {
        return this.parameterName == null ? Optional.empty() : Optional.ofNullable(this.parameterName);
    }

    /**
     * Name of the parameter in the connection provider's OAuth settings
     * 
     */
    @InputImport(name="redirectUrl")
      private final @Nullable String redirectUrl;

    public Optional<String> getRedirectUrl() {
        return this.redirectUrl == null ? Optional.empty() : Optional.ofNullable(this.redirectUrl);
    }

    /**
     * The tenant id
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable String tenantId;

    public Optional<String> getTenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    public ConsentLinkParameterDefinition(
        @Nullable String objectId,
        @Nullable String parameterName,
        @Nullable String redirectUrl,
        @Nullable String tenantId) {
        this.objectId = objectId;
        this.parameterName = parameterName;
        this.redirectUrl = redirectUrl;
        this.tenantId = tenantId;
    }

    private ConsentLinkParameterDefinition() {
        this.objectId = null;
        this.parameterName = null;
        this.redirectUrl = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentLinkParameterDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String objectId;
        private @Nullable String parameterName;
        private @Nullable String redirectUrl;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentLinkParameterDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectId = defaults.objectId;
    	      this.parameterName = defaults.parameterName;
    	      this.redirectUrl = defaults.redirectUrl;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }

        public Builder parameterName(@Nullable String parameterName) {
            this.parameterName = parameterName;
            return this;
        }

        public Builder redirectUrl(@Nullable String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public ConsentLinkParameterDefinition build() {
            return new ConsentLinkParameterDefinition(objectId, parameterName, redirectUrl, tenantId);
        }
    }
}
