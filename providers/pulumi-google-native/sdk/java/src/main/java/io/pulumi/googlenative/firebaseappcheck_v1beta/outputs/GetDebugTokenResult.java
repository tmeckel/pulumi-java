// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaseappcheck_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDebugTokenResult {
    /**
     * A human readable display name used to identify this debug token.
     * 
     */
    private final String displayName;
    /**
     * The relative resource name of the debug token, in the format: ```projects/{project_number}/apps/{app_id}/debugTokens/{debug_token_id}```
     * 
     */
    private final String name;
    /**
     * Input only. Immutable. The secret token itself. Must be provided during creation, and must be a UUID4, case insensitive. This field is immutable once set, and cannot be provided during an UpdateDebugToken request. You can, however, delete this debug token using DeleteDebugToken to revoke it. For security reasons, this field will never be populated in any response.
     * 
     */
    private final String token;

    @OutputCustomType.Constructor({"displayName","name","token"})
    private GetDebugTokenResult(
        String displayName,
        String name,
        String token) {
        this.displayName = Objects.requireNonNull(displayName);
        this.name = Objects.requireNonNull(name);
        this.token = Objects.requireNonNull(token);
    }

    /**
     * A human readable display name used to identify this debug token.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The relative resource name of the debug token, in the format: ```projects/{project_number}/apps/{app_id}/debugTokens/{debug_token_id}```
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Input only. Immutable. The secret token itself. Must be provided during creation, and must be a UUID4, case insensitive. This field is immutable once set, and cannot be provided during an UpdateDebugToken request. You can, however, delete this debug token using DeleteDebugToken to revoke it. For security reasons, this field will never be populated in any response.
     * 
     */
    public String getToken() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDebugTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String name;
        private String token;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDebugTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.token = defaults.token;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setToken(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }

        public GetDebugTokenResult build() {
            return new GetDebugTokenResult(displayName, name, token);
        }
    }
}
