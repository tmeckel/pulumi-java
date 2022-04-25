// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SigningProfilePermissionState extends com.pulumi.resources.ResourceArgs {

    public static final SigningProfilePermissionState Empty = new SigningProfilePermissionState();

    /**
     * An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, or `signer:RevokeSignature`.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, or `signer:RevokeSignature`.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * The AWS principal to be granted a cross-account permission.
     * 
     */
    @Import(name="principal")
    private @Nullable Output<String> principal;

    /**
     * @return The AWS principal to be granted a cross-account permission.
     * 
     */
    public Optional<Output<String>> principal() {
        return Optional.ofNullable(this.principal);
    }

    /**
     * Name of the signing profile to add the cross-account permissions.
     * 
     */
    @Import(name="profileName")
    private @Nullable Output<String> profileName;

    /**
     * @return Name of the signing profile to add the cross-account permissions.
     * 
     */
    public Optional<Output<String>> profileName() {
        return Optional.ofNullable(this.profileName);
    }

    /**
     * The signing profile version that a permission applies to.
     * 
     */
    @Import(name="profileVersion")
    private @Nullable Output<String> profileVersion;

    /**
     * @return The signing profile version that a permission applies to.
     * 
     */
    public Optional<Output<String>> profileVersion() {
        return Optional.ofNullable(this.profileVersion);
    }

    /**
     * A unique statement identifier. By default generated by the provider.
     * 
     */
    @Import(name="statementId")
    private @Nullable Output<String> statementId;

    /**
     * @return A unique statement identifier. By default generated by the provider.
     * 
     */
    public Optional<Output<String>> statementId() {
        return Optional.ofNullable(this.statementId);
    }

    /**
     * A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
     * 
     */
    @Import(name="statementIdPrefix")
    private @Nullable Output<String> statementIdPrefix;

    /**
     * @return A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
     * 
     */
    public Optional<Output<String>> statementIdPrefix() {
        return Optional.ofNullable(this.statementIdPrefix);
    }

    private SigningProfilePermissionState() {}

    private SigningProfilePermissionState(SigningProfilePermissionState $) {
        this.action = $.action;
        this.principal = $.principal;
        this.profileName = $.profileName;
        this.profileVersion = $.profileVersion;
        this.statementId = $.statementId;
        this.statementIdPrefix = $.statementIdPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SigningProfilePermissionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SigningProfilePermissionState $;

        public Builder() {
            $ = new SigningProfilePermissionState();
        }

        public Builder(SigningProfilePermissionState defaults) {
            $ = new SigningProfilePermissionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param action An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, or `signer:RevokeSignature`.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, or `signer:RevokeSignature`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param principal The AWS principal to be granted a cross-account permission.
         * 
         * @return builder
         * 
         */
        public Builder principal(@Nullable Output<String> principal) {
            $.principal = principal;
            return this;
        }

        /**
         * @param principal The AWS principal to be granted a cross-account permission.
         * 
         * @return builder
         * 
         */
        public Builder principal(String principal) {
            return principal(Output.of(principal));
        }

        /**
         * @param profileName Name of the signing profile to add the cross-account permissions.
         * 
         * @return builder
         * 
         */
        public Builder profileName(@Nullable Output<String> profileName) {
            $.profileName = profileName;
            return this;
        }

        /**
         * @param profileName Name of the signing profile to add the cross-account permissions.
         * 
         * @return builder
         * 
         */
        public Builder profileName(String profileName) {
            return profileName(Output.of(profileName));
        }

        /**
         * @param profileVersion The signing profile version that a permission applies to.
         * 
         * @return builder
         * 
         */
        public Builder profileVersion(@Nullable Output<String> profileVersion) {
            $.profileVersion = profileVersion;
            return this;
        }

        /**
         * @param profileVersion The signing profile version that a permission applies to.
         * 
         * @return builder
         * 
         */
        public Builder profileVersion(String profileVersion) {
            return profileVersion(Output.of(profileVersion));
        }

        /**
         * @param statementId A unique statement identifier. By default generated by the provider.
         * 
         * @return builder
         * 
         */
        public Builder statementId(@Nullable Output<String> statementId) {
            $.statementId = statementId;
            return this;
        }

        /**
         * @param statementId A unique statement identifier. By default generated by the provider.
         * 
         * @return builder
         * 
         */
        public Builder statementId(String statementId) {
            return statementId(Output.of(statementId));
        }

        /**
         * @param statementIdPrefix A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
         * 
         * @return builder
         * 
         */
        public Builder statementIdPrefix(@Nullable Output<String> statementIdPrefix) {
            $.statementIdPrefix = statementIdPrefix;
            return this;
        }

        /**
         * @param statementIdPrefix A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
         * 
         * @return builder
         * 
         */
        public Builder statementIdPrefix(String statementIdPrefix) {
            return statementIdPrefix(Output.of(statementIdPrefix));
        }

        public SigningProfilePermissionState build() {
            return $;
        }
    }

}
