// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsupport_v2beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ActorResponse {
    /**
     * The name to display for the actor. If not provided, it is inferred from credentials supplied during case creation. When an email is provided, a display name must also be provided. This will be obfuscated if the user is a Google Support agent.
     * 
     */
    private final String displayName;
    /**
     * The email address of the actor. If not provided, it is inferred from credentials supplied during case creation. If the authenticated principal does not have an email address, one must be provided. When a name is provided, an email must also be provided. This will be obfuscated if the user is a Google Support agent.
     * 
     */
    private final String email;
    /**
     * Whether the actor is a Google support actor.
     * 
     */
    private final Boolean googleSupport;
    /**
     * An ID representing the user that was authenticated when the corresponding action was taken. This will be an email address, if one is available, or some other unique ID. See https://cloud.google.com/docs/authentication for more information on types of authentication.
     * 
     */
    private final String principalId;

    @OutputCustomType.Constructor({"displayName","email","googleSupport","principalId"})
    private ActorResponse(
        String displayName,
        String email,
        Boolean googleSupport,
        String principalId) {
        this.displayName = Objects.requireNonNull(displayName);
        this.email = Objects.requireNonNull(email);
        this.googleSupport = Objects.requireNonNull(googleSupport);
        this.principalId = Objects.requireNonNull(principalId);
    }

    /**
     * The name to display for the actor. If not provided, it is inferred from credentials supplied during case creation. When an email is provided, a display name must also be provided. This will be obfuscated if the user is a Google Support agent.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The email address of the actor. If not provided, it is inferred from credentials supplied during case creation. If the authenticated principal does not have an email address, one must be provided. When a name is provided, an email must also be provided. This will be obfuscated if the user is a Google Support agent.
     * 
     */
    public String getEmail() {
        return this.email;
    }
    /**
     * Whether the actor is a Google support actor.
     * 
     */
    public Boolean getGoogleSupport() {
        return this.googleSupport;
    }
    /**
     * An ID representing the user that was authenticated when the corresponding action was taken. This will be an email address, if one is available, or some other unique ID. See https://cloud.google.com/docs/authentication for more information on types of authentication.
     * 
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String email;
        private Boolean googleSupport;
        private String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(ActorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.email = defaults.email;
    	      this.googleSupport = defaults.googleSupport;
    	      this.principalId = defaults.principalId;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setGoogleSupport(Boolean googleSupport) {
            this.googleSupport = Objects.requireNonNull(googleSupport);
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public ActorResponse build() {
            return new ActorResponse(displayName, email, googleSupport, principalId);
        }
    }
}
