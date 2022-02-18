// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.AccountResponse;
import io.pulumi.googlenative.testing_v1.inputs.ApkResponse;
import io.pulumi.googlenative.testing_v1.inputs.DeviceFileResponse;
import io.pulumi.googlenative.testing_v1.inputs.EnvironmentVariableResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A description of how to set up the Android device prior to running the test.
 * 
 */
public final class TestSetupResponse extends io.pulumi.resources.InvokeArgs {

    public static final TestSetupResponse Empty = new TestSetupResponse();

    /**
     * The device will be logged in on this account for the duration of the test.
     * 
     */
    @InputImport(name="account", required=true)
    private final AccountResponse account;

    public AccountResponse getAccount() {
        return this.account;
    }

    /**
     * APKs to install in addition to those being directly tested. Currently capped at 100.
     * 
     */
    @InputImport(name="additionalApks", required=true)
    private final List<ApkResponse> additionalApks;

    public List<ApkResponse> getAdditionalApks() {
        return this.additionalApks;
    }

    /**
     * List of directories on the device to upload to GCS at the end of the test; they must be absolute paths under /sdcard, /storage or /data/local/tmp. Path names are restricted to characters a-z A-Z 0-9 _ - . + and / Note: The paths /sdcard and /data will be made available and treated as implicit path substitutions. E.g. if /sdcard on a particular device does not map to external storage, the system will replace it with the external storage path prefix for that device.
     * 
     */
    @InputImport(name="directoriesToPull", required=true)
    private final List<String> directoriesToPull;

    public List<String> getDirectoriesToPull() {
        return this.directoriesToPull;
    }

    /**
     * Whether to prevent all runtime permissions to be granted at app install
     * 
     */
    @InputImport(name="dontAutograntPermissions", required=true)
    private final Boolean dontAutograntPermissions;

    public Boolean getDontAutograntPermissions() {
        return this.dontAutograntPermissions;
    }

    /**
     * Environment variables to set for the test (only applicable for instrumentation tests).
     * 
     */
    @InputImport(name="environmentVariables", required=true)
    private final List<EnvironmentVariableResponse> environmentVariables;

    public List<EnvironmentVariableResponse> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    /**
     * List of files to push to the device before starting the test.
     * 
     */
    @InputImport(name="filesToPush", required=true)
    private final List<DeviceFileResponse> filesToPush;

    public List<DeviceFileResponse> getFilesToPush() {
        return this.filesToPush;
    }

    /**
     * The network traffic profile used for running the test. Available network profiles can be queried by using the NETWORK_CONFIGURATION environment type when calling TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
     * 
     */
    @InputImport(name="networkProfile", required=true)
    private final String networkProfile;

    public String getNetworkProfile() {
        return this.networkProfile;
    }

    public TestSetupResponse(
        AccountResponse account,
        List<ApkResponse> additionalApks,
        List<String> directoriesToPull,
        Boolean dontAutograntPermissions,
        List<EnvironmentVariableResponse> environmentVariables,
        List<DeviceFileResponse> filesToPush,
        String networkProfile) {
        this.account = Objects.requireNonNull(account, "expected parameter 'account' to be non-null");
        this.additionalApks = Objects.requireNonNull(additionalApks, "expected parameter 'additionalApks' to be non-null");
        this.directoriesToPull = Objects.requireNonNull(directoriesToPull, "expected parameter 'directoriesToPull' to be non-null");
        this.dontAutograntPermissions = Objects.requireNonNull(dontAutograntPermissions, "expected parameter 'dontAutograntPermissions' to be non-null");
        this.environmentVariables = Objects.requireNonNull(environmentVariables, "expected parameter 'environmentVariables' to be non-null");
        this.filesToPush = Objects.requireNonNull(filesToPush, "expected parameter 'filesToPush' to be non-null");
        this.networkProfile = Objects.requireNonNull(networkProfile, "expected parameter 'networkProfile' to be non-null");
    }

    private TestSetupResponse() {
        this.account = null;
        this.additionalApks = List.of();
        this.directoriesToPull = List.of();
        this.dontAutograntPermissions = null;
        this.environmentVariables = List.of();
        this.filesToPush = List.of();
        this.networkProfile = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestSetupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountResponse account;
        private List<ApkResponse> additionalApks;
        private List<String> directoriesToPull;
        private Boolean dontAutograntPermissions;
        private List<EnvironmentVariableResponse> environmentVariables;
        private List<DeviceFileResponse> filesToPush;
        private String networkProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(TestSetupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.additionalApks = defaults.additionalApks;
    	      this.directoriesToPull = defaults.directoriesToPull;
    	      this.dontAutograntPermissions = defaults.dontAutograntPermissions;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.filesToPush = defaults.filesToPush;
    	      this.networkProfile = defaults.networkProfile;
        }

        public Builder setAccount(AccountResponse account) {
            this.account = Objects.requireNonNull(account);
            return this;
        }

        public Builder setAdditionalApks(List<ApkResponse> additionalApks) {
            this.additionalApks = Objects.requireNonNull(additionalApks);
            return this;
        }

        public Builder setDirectoriesToPull(List<String> directoriesToPull) {
            this.directoriesToPull = Objects.requireNonNull(directoriesToPull);
            return this;
        }

        public Builder setDontAutograntPermissions(Boolean dontAutograntPermissions) {
            this.dontAutograntPermissions = Objects.requireNonNull(dontAutograntPermissions);
            return this;
        }

        public Builder setEnvironmentVariables(List<EnvironmentVariableResponse> environmentVariables) {
            this.environmentVariables = Objects.requireNonNull(environmentVariables);
            return this;
        }

        public Builder setFilesToPush(List<DeviceFileResponse> filesToPush) {
            this.filesToPush = Objects.requireNonNull(filesToPush);
            return this;
        }

        public Builder setNetworkProfile(String networkProfile) {
            this.networkProfile = Objects.requireNonNull(networkProfile);
            return this;
        }

        public TestSetupResponse build() {
            return new TestSetupResponse(account, additionalApks, directoriesToPull, dontAutograntPermissions, environmentVariables, filesToPush, networkProfile);
        }
    }
}
