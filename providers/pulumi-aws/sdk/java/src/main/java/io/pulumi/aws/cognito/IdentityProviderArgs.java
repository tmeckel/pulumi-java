// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityProviderArgs Empty = new IdentityProviderArgs();

    /**
     * The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
     * 
     */
    @Import(name="attributeMapping")
      private final @Nullable Output<Map<String,String>> attributeMapping;

    public Output<Map<String,String>> getAttributeMapping() {
        return this.attributeMapping == null ? Codegen.empty() : this.attributeMapping;
    }

    /**
     * The list of identity providers.
     * 
     */
    @Import(name="idpIdentifiers")
      private final @Nullable Output<List<String>> idpIdentifiers;

    public Output<List<String>> getIdpIdentifiers() {
        return this.idpIdentifiers == null ? Codegen.empty() : this.idpIdentifiers;
    }

    /**
     * The map of identity details, such as access token
     * 
     */
    @Import(name="providerDetails", required=true)
      private final Output<Map<String,String>> providerDetails;

    public Output<Map<String,String>> getProviderDetails() {
        return this.providerDetails;
    }

    /**
     * The provider name
     * 
     */
    @Import(name="providerName", required=true)
      private final Output<String> providerName;

    public Output<String> getProviderName() {
        return this.providerName;
    }

    /**
     * The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
     * 
     */
    @Import(name="providerType", required=true)
      private final Output<String> providerType;

    public Output<String> getProviderType() {
        return this.providerType;
    }

    /**
     * The user pool id
     * 
     */
    @Import(name="userPoolId", required=true)
      private final Output<String> userPoolId;

    public Output<String> getUserPoolId() {
        return this.userPoolId;
    }

    public IdentityProviderArgs(
        @Nullable Output<Map<String,String>> attributeMapping,
        @Nullable Output<List<String>> idpIdentifiers,
        Output<Map<String,String>> providerDetails,
        Output<String> providerName,
        Output<String> providerType,
        Output<String> userPoolId) {
        this.attributeMapping = attributeMapping;
        this.idpIdentifiers = idpIdentifiers;
        this.providerDetails = Objects.requireNonNull(providerDetails, "expected parameter 'providerDetails' to be non-null");
        this.providerName = Objects.requireNonNull(providerName, "expected parameter 'providerName' to be non-null");
        this.providerType = Objects.requireNonNull(providerType, "expected parameter 'providerType' to be non-null");
        this.userPoolId = Objects.requireNonNull(userPoolId, "expected parameter 'userPoolId' to be non-null");
    }

    private IdentityProviderArgs() {
        this.attributeMapping = Codegen.empty();
        this.idpIdentifiers = Codegen.empty();
        this.providerDetails = Codegen.empty();
        this.providerName = Codegen.empty();
        this.providerType = Codegen.empty();
        this.userPoolId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> attributeMapping;
        private @Nullable Output<List<String>> idpIdentifiers;
        private Output<Map<String,String>> providerDetails;
        private Output<String> providerName;
        private Output<String> providerType;
        private Output<String> userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeMapping = defaults.attributeMapping;
    	      this.idpIdentifiers = defaults.idpIdentifiers;
    	      this.providerDetails = defaults.providerDetails;
    	      this.providerName = defaults.providerName;
    	      this.providerType = defaults.providerType;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder attributeMapping(@Nullable Output<Map<String,String>> attributeMapping) {
            this.attributeMapping = attributeMapping;
            return this;
        }
        public Builder attributeMapping(@Nullable Map<String,String> attributeMapping) {
            this.attributeMapping = Codegen.ofNullable(attributeMapping);
            return this;
        }
        public Builder idpIdentifiers(@Nullable Output<List<String>> idpIdentifiers) {
            this.idpIdentifiers = idpIdentifiers;
            return this;
        }
        public Builder idpIdentifiers(@Nullable List<String> idpIdentifiers) {
            this.idpIdentifiers = Codegen.ofNullable(idpIdentifiers);
            return this;
        }
        public Builder idpIdentifiers(String... idpIdentifiers) {
            return idpIdentifiers(List.of(idpIdentifiers));
        }
        public Builder providerDetails(Output<Map<String,String>> providerDetails) {
            this.providerDetails = Objects.requireNonNull(providerDetails);
            return this;
        }
        public Builder providerDetails(Map<String,String> providerDetails) {
            this.providerDetails = Output.of(Objects.requireNonNull(providerDetails));
            return this;
        }
        public Builder providerName(Output<String> providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }
        public Builder providerName(String providerName) {
            this.providerName = Output.of(Objects.requireNonNull(providerName));
            return this;
        }
        public Builder providerType(Output<String> providerType) {
            this.providerType = Objects.requireNonNull(providerType);
            return this;
        }
        public Builder providerType(String providerType) {
            this.providerType = Output.of(Objects.requireNonNull(providerType));
            return this;
        }
        public Builder userPoolId(Output<String> userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }
        public Builder userPoolId(String userPoolId) {
            this.userPoolId = Output.of(Objects.requireNonNull(userPoolId));
            return this;
        }        public IdentityProviderArgs build() {
            return new IdentityProviderArgs(attributeMapping, idpIdentifiers, providerDetails, providerName, providerType, userPoolId);
        }
    }
}
