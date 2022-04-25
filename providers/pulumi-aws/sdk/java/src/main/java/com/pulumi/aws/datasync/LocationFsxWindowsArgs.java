// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LocationFsxWindowsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocationFsxWindowsArgs Empty = new LocationFsxWindowsArgs();

    /**
     * The name of the Windows domain that the FSx for Windows server belongs to.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The name of the Windows domain that the FSx for Windows server belongs to.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * The Amazon Resource Name (ARN) for the FSx for Windows file system.
     * 
     */
    @Import(name="fsxFilesystemArn", required=true)
    private Output<String> fsxFilesystemArn;

    /**
     * @return The Amazon Resource Name (ARN) for the FSx for Windows file system.
     * 
     */
    public Output<String> fsxFilesystemArn() {
        return this.fsxFilesystemArn;
    }

    /**
     * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
     * 
     */
    @Import(name="securityGroupArns", required=true)
    private Output<List<String>> securityGroupArns;

    /**
     * @return The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
     * 
     */
    public Output<List<String>> securityGroupArns() {
        return this.securityGroupArns;
    }

    /**
     * Subdirectory to perform actions as source or destination.
     * 
     */
    @Import(name="subdirectory")
    private @Nullable Output<String> subdirectory;

    /**
     * @return Subdirectory to perform actions as source or destination.
     * 
     */
    public Optional<Output<String>> subdirectory() {
        return Optional.ofNullable(this.subdirectory);
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    @Import(name="user", required=true)
    private Output<String> user;

    /**
     * @return The user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    private LocationFsxWindowsArgs() {}

    private LocationFsxWindowsArgs(LocationFsxWindowsArgs $) {
        this.domain = $.domain;
        this.fsxFilesystemArn = $.fsxFilesystemArn;
        this.password = $.password;
        this.securityGroupArns = $.securityGroupArns;
        this.subdirectory = $.subdirectory;
        this.tags = $.tags;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationFsxWindowsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationFsxWindowsArgs $;

        public Builder() {
            $ = new LocationFsxWindowsArgs();
        }

        public Builder(LocationFsxWindowsArgs defaults) {
            $ = new LocationFsxWindowsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The name of the Windows domain that the FSx for Windows server belongs to.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The name of the Windows domain that the FSx for Windows server belongs to.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param fsxFilesystemArn The Amazon Resource Name (ARN) for the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder fsxFilesystemArn(Output<String> fsxFilesystemArn) {
            $.fsxFilesystemArn = fsxFilesystemArn;
            return this;
        }

        /**
         * @param fsxFilesystemArn The Amazon Resource Name (ARN) for the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder fsxFilesystemArn(String fsxFilesystemArn) {
            return fsxFilesystemArn(Output.of(fsxFilesystemArn));
        }

        /**
         * @param password The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupArns(Output<List<String>> securityGroupArns) {
            $.securityGroupArns = securityGroupArns;
            return this;
        }

        /**
         * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupArns(List<String> securityGroupArns) {
            return securityGroupArns(Output.of(securityGroupArns));
        }

        /**
         * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupArns(String... securityGroupArns) {
            return securityGroupArns(List.of(securityGroupArns));
        }

        /**
         * @param subdirectory Subdirectory to perform actions as source or destination.
         * 
         * @return builder
         * 
         */
        public Builder subdirectory(@Nullable Output<String> subdirectory) {
            $.subdirectory = subdirectory;
            return this;
        }

        /**
         * @param subdirectory Subdirectory to perform actions as source or destination.
         * 
         * @return builder
         * 
         */
        public Builder subdirectory(String subdirectory) {
            return subdirectory(Output.of(subdirectory));
        }

        /**
         * @param tags Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param user The user who has the permissions to access files and folders in the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder user(Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user The user who has the permissions to access files and folders in the FSx for Windows file system.
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public LocationFsxWindowsArgs build() {
            $.fsxFilesystemArn = Objects.requireNonNull($.fsxFilesystemArn, "expected parameter 'fsxFilesystemArn' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.securityGroupArns = Objects.requireNonNull($.securityGroupArns, "expected parameter 'securityGroupArns' to be non-null");
            $.user = Objects.requireNonNull($.user, "expected parameter 'user' to be non-null");
            return $;
        }
    }

}
