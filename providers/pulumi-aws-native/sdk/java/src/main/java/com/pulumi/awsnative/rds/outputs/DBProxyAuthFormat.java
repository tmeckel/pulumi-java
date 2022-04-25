// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.rds.outputs;

import com.pulumi.awsnative.rds.enums.DBProxyAuthFormatAuthScheme;
import com.pulumi.awsnative.rds.enums.DBProxyAuthFormatIAMAuth;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DBProxyAuthFormat {
    /**
     * @return The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * 
     */
    private final @Nullable DBProxyAuthFormatAuthScheme authScheme;
    /**
     * @return A user-specified description about the authentication used by a proxy to log in as a specific database user.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy.
     * 
     */
    private final @Nullable DBProxyAuthFormatIAMAuth iAMAuth;
    /**
     * @return The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
     * 
     */
    private final @Nullable String secretArn;
    /**
     * @return The name of the database user to which the proxy connects.
     * 
     */
    private final @Nullable String userName;

    @CustomType.Constructor
    private DBProxyAuthFormat(
        @CustomType.Parameter("authScheme") @Nullable DBProxyAuthFormatAuthScheme authScheme,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("iAMAuth") @Nullable DBProxyAuthFormatIAMAuth iAMAuth,
        @CustomType.Parameter("secretArn") @Nullable String secretArn,
        @CustomType.Parameter("userName") @Nullable String userName) {
        this.authScheme = authScheme;
        this.description = description;
        this.iAMAuth = iAMAuth;
        this.secretArn = secretArn;
        this.userName = userName;
    }

    /**
     * @return The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * 
     */
    public Optional<DBProxyAuthFormatAuthScheme> authScheme() {
        return Optional.ofNullable(this.authScheme);
    }
    /**
     * @return A user-specified description about the authentication used by a proxy to log in as a specific database user.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy.
     * 
     */
    public Optional<DBProxyAuthFormatIAMAuth> iAMAuth() {
        return Optional.ofNullable(this.iAMAuth);
    }
    /**
     * @return The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
     * 
     */
    public Optional<String> secretArn() {
        return Optional.ofNullable(this.secretArn);
    }
    /**
     * @return The name of the database user to which the proxy connects.
     * 
     */
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DBProxyAuthFormat defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DBProxyAuthFormatAuthScheme authScheme;
        private @Nullable String description;
        private @Nullable DBProxyAuthFormatIAMAuth iAMAuth;
        private @Nullable String secretArn;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(DBProxyAuthFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authScheme = defaults.authScheme;
    	      this.description = defaults.description;
    	      this.iAMAuth = defaults.iAMAuth;
    	      this.secretArn = defaults.secretArn;
    	      this.userName = defaults.userName;
        }

        public Builder authScheme(@Nullable DBProxyAuthFormatAuthScheme authScheme) {
            this.authScheme = authScheme;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder iAMAuth(@Nullable DBProxyAuthFormatIAMAuth iAMAuth) {
            this.iAMAuth = iAMAuth;
            return this;
        }
        public Builder secretArn(@Nullable String secretArn) {
            this.secretArn = secretArn;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }        public DBProxyAuthFormat build() {
            return new DBProxyAuthFormat(authScheme, description, iAMAuth, secretArn, userName);
        }
    }
}
