// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.memorydb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserAuthenticationMode {
    /**
     * @return The number of passwords belonging to the user.
     * 
     */
    private final @Nullable Integer passwordCount;
    /**
     * @return The set of passwords used for authentication. You can create up to two passwords for each user.
     * 
     */
    private final List<String> passwords;
    /**
     * @return Indicates whether the user requires a password to authenticate. Must be set to `password`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private UserAuthenticationMode(
        @CustomType.Parameter("passwordCount") @Nullable Integer passwordCount,
        @CustomType.Parameter("passwords") List<String> passwords,
        @CustomType.Parameter("type") String type) {
        this.passwordCount = passwordCount;
        this.passwords = passwords;
        this.type = type;
    }

    /**
     * @return The number of passwords belonging to the user.
     * 
     */
    public Optional<Integer> passwordCount() {
        return Optional.ofNullable(this.passwordCount);
    }
    /**
     * @return The set of passwords used for authentication. You can create up to two passwords for each user.
     * 
     */
    public List<String> passwords() {
        return this.passwords;
    }
    /**
     * @return Indicates whether the user requires a password to authenticate. Must be set to `password`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAuthenticationMode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer passwordCount;
        private List<String> passwords;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAuthenticationMode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwordCount = defaults.passwordCount;
    	      this.passwords = defaults.passwords;
    	      this.type = defaults.type;
        }

        public Builder passwordCount(@Nullable Integer passwordCount) {
            this.passwordCount = passwordCount;
            return this;
        }
        public Builder passwords(List<String> passwords) {
            this.passwords = Objects.requireNonNull(passwords);
            return this;
        }
        public Builder passwords(String... passwords) {
            return passwords(List.of(passwords));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public UserAuthenticationMode build() {
            return new UserAuthenticationMode(passwordCount, passwords, type);
        }
    }
}
