// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.VirtualMachineSshCredentialsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HDInsightPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final HDInsightPropertiesArgs Empty = new HDInsightPropertiesArgs();

    /**
     * Public IP address of the master node of the cluster.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return Public IP address of the master node of the cluster.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * Admin credentials for master node of the cluster
     * 
     */
    @Import(name="administratorAccount")
    private @Nullable Output<VirtualMachineSshCredentialsArgs> administratorAccount;

    /**
     * @return Admin credentials for master node of the cluster
     * 
     */
    public Optional<Output<VirtualMachineSshCredentialsArgs>> administratorAccount() {
        return Optional.ofNullable(this.administratorAccount);
    }

    /**
     * Port open for ssh connections on the master node of the cluster.
     * 
     */
    @Import(name="sshPort")
    private @Nullable Output<Integer> sshPort;

    /**
     * @return Port open for ssh connections on the master node of the cluster.
     * 
     */
    public Optional<Output<Integer>> sshPort() {
        return Optional.ofNullable(this.sshPort);
    }

    private HDInsightPropertiesArgs() {}

    private HDInsightPropertiesArgs(HDInsightPropertiesArgs $) {
        this.address = $.address;
        this.administratorAccount = $.administratorAccount;
        this.sshPort = $.sshPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HDInsightPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HDInsightPropertiesArgs $;

        public Builder() {
            $ = new HDInsightPropertiesArgs();
        }

        public Builder(HDInsightPropertiesArgs defaults) {
            $ = new HDInsightPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address Public IP address of the master node of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address Public IP address of the master node of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param administratorAccount Admin credentials for master node of the cluster
         * 
         * @return builder
         * 
         */
        public Builder administratorAccount(@Nullable Output<VirtualMachineSshCredentialsArgs> administratorAccount) {
            $.administratorAccount = administratorAccount;
            return this;
        }

        /**
         * @param administratorAccount Admin credentials for master node of the cluster
         * 
         * @return builder
         * 
         */
        public Builder administratorAccount(VirtualMachineSshCredentialsArgs administratorAccount) {
            return administratorAccount(Output.of(administratorAccount));
        }

        /**
         * @param sshPort Port open for ssh connections on the master node of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder sshPort(@Nullable Output<Integer> sshPort) {
            $.sshPort = sshPort;
            return this;
        }

        /**
         * @param sshPort Port open for ssh connections on the master node of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder sshPort(Integer sshPort) {
            return sshPort(Output.of(sshPort));
        }

        public HDInsightPropertiesArgs build() {
            return $;
        }
    }

}
