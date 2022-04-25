// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation.outputs;

import com.pulumi.awsnative.cloudformation.enums.PublisherIdentityProvider;
import com.pulumi.awsnative.cloudformation.enums.PublisherStatus;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPublisherResult {
    /**
     * @return The type of account used as the identity provider when registering this publisher with CloudFormation.
     * 
     */
    private final @Nullable PublisherIdentityProvider identityProvider;
    /**
     * @return The publisher id assigned by CloudFormation for publishing in this region.
     * 
     */
    private final @Nullable String publisherId;
    /**
     * @return The URL to the publisher&#39;s profile with the identity provider.
     * 
     */
    private final @Nullable String publisherProfile;
    /**
     * @return Whether the publisher is verified.
     * 
     */
    private final @Nullable PublisherStatus publisherStatus;

    @CustomType.Constructor
    private GetPublisherResult(
        @CustomType.Parameter("identityProvider") @Nullable PublisherIdentityProvider identityProvider,
        @CustomType.Parameter("publisherId") @Nullable String publisherId,
        @CustomType.Parameter("publisherProfile") @Nullable String publisherProfile,
        @CustomType.Parameter("publisherStatus") @Nullable PublisherStatus publisherStatus) {
        this.identityProvider = identityProvider;
        this.publisherId = publisherId;
        this.publisherProfile = publisherProfile;
        this.publisherStatus = publisherStatus;
    }

    /**
     * @return The type of account used as the identity provider when registering this publisher with CloudFormation.
     * 
     */
    public Optional<PublisherIdentityProvider> identityProvider() {
        return Optional.ofNullable(this.identityProvider);
    }
    /**
     * @return The publisher id assigned by CloudFormation for publishing in this region.
     * 
     */
    public Optional<String> publisherId() {
        return Optional.ofNullable(this.publisherId);
    }
    /**
     * @return The URL to the publisher&#39;s profile with the identity provider.
     * 
     */
    public Optional<String> publisherProfile() {
        return Optional.ofNullable(this.publisherProfile);
    }
    /**
     * @return Whether the publisher is verified.
     * 
     */
    public Optional<PublisherStatus> publisherStatus() {
        return Optional.ofNullable(this.publisherStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublisherResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PublisherIdentityProvider identityProvider;
        private @Nullable String publisherId;
        private @Nullable String publisherProfile;
        private @Nullable PublisherStatus publisherStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublisherResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityProvider = defaults.identityProvider;
    	      this.publisherId = defaults.publisherId;
    	      this.publisherProfile = defaults.publisherProfile;
    	      this.publisherStatus = defaults.publisherStatus;
        }

        public Builder identityProvider(@Nullable PublisherIdentityProvider identityProvider) {
            this.identityProvider = identityProvider;
            return this;
        }
        public Builder publisherId(@Nullable String publisherId) {
            this.publisherId = publisherId;
            return this;
        }
        public Builder publisherProfile(@Nullable String publisherProfile) {
            this.publisherProfile = publisherProfile;
            return this;
        }
        public Builder publisherStatus(@Nullable PublisherStatus publisherStatus) {
            this.publisherStatus = publisherStatus;
            return this;
        }        public GetPublisherResult build() {
            return new GetPublisherResult(identityProvider, publisherId, publisherProfile, publisherStatus);
        }
    }
}
