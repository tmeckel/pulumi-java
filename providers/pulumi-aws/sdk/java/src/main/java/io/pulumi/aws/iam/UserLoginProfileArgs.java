// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserLoginProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserLoginProfileArgs Empty = new UserLoginProfileArgs();

    /**
     * The length of the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
     * 
     */
    @InputImport(name="passwordLength")
      private final @Nullable Input<Integer> passwordLength;

    public Input<Integer> getPasswordLength() {
        return this.passwordLength == null ? Input.empty() : this.passwordLength;
    }

    /**
     * Whether the user should be forced to reset the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
     * 
     */
    @InputImport(name="passwordResetRequired")
      private final @Nullable Input<Boolean> passwordResetRequired;

    public Input<Boolean> getPasswordResetRequired() {
        return this.passwordResetRequired == null ? Input.empty() : this.passwordResetRequired;
    }

    /**
     * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:username`. Only applies on resource creation. Drift detection is not possible with this argument.
     * 
     */
    @InputImport(name="pgpKey", required=true)
      private final Input<String> pgpKey;

    public Input<String> getPgpKey() {
        return this.pgpKey;
    }

    /**
     * The IAM user's name.
     * 
     */
    @InputImport(name="user", required=true)
      private final Input<String> user;

    public Input<String> getUser() {
        return this.user;
    }

    public UserLoginProfileArgs(
        @Nullable Input<Integer> passwordLength,
        @Nullable Input<Boolean> passwordResetRequired,
        Input<String> pgpKey,
        Input<String> user) {
        this.passwordLength = passwordLength;
        this.passwordResetRequired = passwordResetRequired;
        this.pgpKey = Objects.requireNonNull(pgpKey, "expected parameter 'pgpKey' to be non-null");
        this.user = Objects.requireNonNull(user, "expected parameter 'user' to be non-null");
    }

    private UserLoginProfileArgs() {
        this.passwordLength = Input.empty();
        this.passwordResetRequired = Input.empty();
        this.pgpKey = Input.empty();
        this.user = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserLoginProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> passwordLength;
        private @Nullable Input<Boolean> passwordResetRequired;
        private Input<String> pgpKey;
        private Input<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(UserLoginProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwordLength = defaults.passwordLength;
    	      this.passwordResetRequired = defaults.passwordResetRequired;
    	      this.pgpKey = defaults.pgpKey;
    	      this.user = defaults.user;
        }

        public Builder passwordLength(@Nullable Input<Integer> passwordLength) {
            this.passwordLength = passwordLength;
            return this;
        }

        public Builder passwordLength(@Nullable Integer passwordLength) {
            this.passwordLength = Input.ofNullable(passwordLength);
            return this;
        }

        public Builder passwordResetRequired(@Nullable Input<Boolean> passwordResetRequired) {
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }

        public Builder passwordResetRequired(@Nullable Boolean passwordResetRequired) {
            this.passwordResetRequired = Input.ofNullable(passwordResetRequired);
            return this;
        }

        public Builder pgpKey(Input<String> pgpKey) {
            this.pgpKey = Objects.requireNonNull(pgpKey);
            return this;
        }

        public Builder pgpKey(String pgpKey) {
            this.pgpKey = Input.of(Objects.requireNonNull(pgpKey));
            return this;
        }

        public Builder user(Input<String> user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }

        public Builder user(String user) {
            this.user = Input.of(Objects.requireNonNull(user));
            return this;
        }
        public UserLoginProfileArgs build() {
            return new UserLoginProfileArgs(passwordLength, passwordResetRequired, pgpKey, user);
        }
    }
}
