// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sysctl settings for Linux agent nodes.
 * 
 */
public final class SysctlConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SysctlConfigArgs Empty = new SysctlConfigArgs();

    /**
     * Sysctl setting fs.aio-max-nr.
     * 
     */
    @Import(name="fsAioMaxNr")
    private @Nullable Output<Integer> fsAioMaxNr;

    /**
     * @return Sysctl setting fs.aio-max-nr.
     * 
     */
    public Optional<Output<Integer>> fsAioMaxNr() {
        return Optional.ofNullable(this.fsAioMaxNr);
    }

    /**
     * Sysctl setting fs.file-max.
     * 
     */
    @Import(name="fsFileMax")
    private @Nullable Output<Integer> fsFileMax;

    /**
     * @return Sysctl setting fs.file-max.
     * 
     */
    public Optional<Output<Integer>> fsFileMax() {
        return Optional.ofNullable(this.fsFileMax);
    }

    /**
     * Sysctl setting fs.inotify.max_user_watches.
     * 
     */
    @Import(name="fsInotifyMaxUserWatches")
    private @Nullable Output<Integer> fsInotifyMaxUserWatches;

    /**
     * @return Sysctl setting fs.inotify.max_user_watches.
     * 
     */
    public Optional<Output<Integer>> fsInotifyMaxUserWatches() {
        return Optional.ofNullable(this.fsInotifyMaxUserWatches);
    }

    /**
     * Sysctl setting fs.nr_open.
     * 
     */
    @Import(name="fsNrOpen")
    private @Nullable Output<Integer> fsNrOpen;

    /**
     * @return Sysctl setting fs.nr_open.
     * 
     */
    public Optional<Output<Integer>> fsNrOpen() {
        return Optional.ofNullable(this.fsNrOpen);
    }

    /**
     * Sysctl setting kernel.threads-max.
     * 
     */
    @Import(name="kernelThreadsMax")
    private @Nullable Output<Integer> kernelThreadsMax;

    /**
     * @return Sysctl setting kernel.threads-max.
     * 
     */
    public Optional<Output<Integer>> kernelThreadsMax() {
        return Optional.ofNullable(this.kernelThreadsMax);
    }

    /**
     * Sysctl setting net.core.netdev_max_backlog.
     * 
     */
    @Import(name="netCoreNetdevMaxBacklog")
    private @Nullable Output<Integer> netCoreNetdevMaxBacklog;

    /**
     * @return Sysctl setting net.core.netdev_max_backlog.
     * 
     */
    public Optional<Output<Integer>> netCoreNetdevMaxBacklog() {
        return Optional.ofNullable(this.netCoreNetdevMaxBacklog);
    }

    /**
     * Sysctl setting net.core.optmem_max.
     * 
     */
    @Import(name="netCoreOptmemMax")
    private @Nullable Output<Integer> netCoreOptmemMax;

    /**
     * @return Sysctl setting net.core.optmem_max.
     * 
     */
    public Optional<Output<Integer>> netCoreOptmemMax() {
        return Optional.ofNullable(this.netCoreOptmemMax);
    }

    /**
     * Sysctl setting net.core.rmem_default.
     * 
     */
    @Import(name="netCoreRmemDefault")
    private @Nullable Output<Integer> netCoreRmemDefault;

    /**
     * @return Sysctl setting net.core.rmem_default.
     * 
     */
    public Optional<Output<Integer>> netCoreRmemDefault() {
        return Optional.ofNullable(this.netCoreRmemDefault);
    }

    /**
     * Sysctl setting net.core.rmem_max.
     * 
     */
    @Import(name="netCoreRmemMax")
    private @Nullable Output<Integer> netCoreRmemMax;

    /**
     * @return Sysctl setting net.core.rmem_max.
     * 
     */
    public Optional<Output<Integer>> netCoreRmemMax() {
        return Optional.ofNullable(this.netCoreRmemMax);
    }

    /**
     * Sysctl setting net.core.somaxconn.
     * 
     */
    @Import(name="netCoreSomaxconn")
    private @Nullable Output<Integer> netCoreSomaxconn;

    /**
     * @return Sysctl setting net.core.somaxconn.
     * 
     */
    public Optional<Output<Integer>> netCoreSomaxconn() {
        return Optional.ofNullable(this.netCoreSomaxconn);
    }

    /**
     * Sysctl setting net.core.wmem_default.
     * 
     */
    @Import(name="netCoreWmemDefault")
    private @Nullable Output<Integer> netCoreWmemDefault;

    /**
     * @return Sysctl setting net.core.wmem_default.
     * 
     */
    public Optional<Output<Integer>> netCoreWmemDefault() {
        return Optional.ofNullable(this.netCoreWmemDefault);
    }

    /**
     * Sysctl setting net.core.wmem_max.
     * 
     */
    @Import(name="netCoreWmemMax")
    private @Nullable Output<Integer> netCoreWmemMax;

    /**
     * @return Sysctl setting net.core.wmem_max.
     * 
     */
    public Optional<Output<Integer>> netCoreWmemMax() {
        return Optional.ofNullable(this.netCoreWmemMax);
    }

    /**
     * Sysctl setting net.ipv4.ip_local_port_range.
     * 
     */
    @Import(name="netIpv4IpLocalPortRange")
    private @Nullable Output<String> netIpv4IpLocalPortRange;

    /**
     * @return Sysctl setting net.ipv4.ip_local_port_range.
     * 
     */
    public Optional<Output<String>> netIpv4IpLocalPortRange() {
        return Optional.ofNullable(this.netIpv4IpLocalPortRange);
    }

    /**
     * Sysctl setting net.ipv4.neigh.default.gc_thresh1.
     * 
     */
    @Import(name="netIpv4NeighDefaultGcThresh1")
    private @Nullable Output<Integer> netIpv4NeighDefaultGcThresh1;

    /**
     * @return Sysctl setting net.ipv4.neigh.default.gc_thresh1.
     * 
     */
    public Optional<Output<Integer>> netIpv4NeighDefaultGcThresh1() {
        return Optional.ofNullable(this.netIpv4NeighDefaultGcThresh1);
    }

    /**
     * Sysctl setting net.ipv4.neigh.default.gc_thresh2.
     * 
     */
    @Import(name="netIpv4NeighDefaultGcThresh2")
    private @Nullable Output<Integer> netIpv4NeighDefaultGcThresh2;

    /**
     * @return Sysctl setting net.ipv4.neigh.default.gc_thresh2.
     * 
     */
    public Optional<Output<Integer>> netIpv4NeighDefaultGcThresh2() {
        return Optional.ofNullable(this.netIpv4NeighDefaultGcThresh2);
    }

    /**
     * Sysctl setting net.ipv4.neigh.default.gc_thresh3.
     * 
     */
    @Import(name="netIpv4NeighDefaultGcThresh3")
    private @Nullable Output<Integer> netIpv4NeighDefaultGcThresh3;

    /**
     * @return Sysctl setting net.ipv4.neigh.default.gc_thresh3.
     * 
     */
    public Optional<Output<Integer>> netIpv4NeighDefaultGcThresh3() {
        return Optional.ofNullable(this.netIpv4NeighDefaultGcThresh3);
    }

    /**
     * Sysctl setting net.ipv4.tcp_fin_timeout.
     * 
     */
    @Import(name="netIpv4TcpFinTimeout")
    private @Nullable Output<Integer> netIpv4TcpFinTimeout;

    /**
     * @return Sysctl setting net.ipv4.tcp_fin_timeout.
     * 
     */
    public Optional<Output<Integer>> netIpv4TcpFinTimeout() {
        return Optional.ofNullable(this.netIpv4TcpFinTimeout);
    }

    /**
     * Sysctl setting net.ipv4.tcp_keepalive_probes.
     * 
     */
    @Import(name="netIpv4TcpKeepaliveProbes")
    private @Nullable Output<Integer> netIpv4TcpKeepaliveProbes;

    /**
     * @return Sysctl setting net.ipv4.tcp_keepalive_probes.
     * 
     */
    public Optional<Output<Integer>> netIpv4TcpKeepaliveProbes() {
        return Optional.ofNullable(this.netIpv4TcpKeepaliveProbes);
    }

    /**
     * Sysctl setting net.ipv4.tcp_keepalive_time.
     * 
     */
    @Import(name="netIpv4TcpKeepaliveTime")
    private @Nullable Output<Integer> netIpv4TcpKeepaliveTime;

    /**
     * @return Sysctl setting net.ipv4.tcp_keepalive_time.
     * 
     */
    public Optional<Output<Integer>> netIpv4TcpKeepaliveTime() {
        return Optional.ofNullable(this.netIpv4TcpKeepaliveTime);
    }

    /**
     * Sysctl setting net.ipv4.tcp_max_syn_backlog.
     * 
     */
    @Import(name="netIpv4TcpMaxSynBacklog")
    private @Nullable Output<Integer> netIpv4TcpMaxSynBacklog;

    /**
     * @return Sysctl setting net.ipv4.tcp_max_syn_backlog.
     * 
     */
    public Optional<Output<Integer>> netIpv4TcpMaxSynBacklog() {
        return Optional.ofNullable(this.netIpv4TcpMaxSynBacklog);
    }

    /**
     * Sysctl setting net.ipv4.tcp_max_tw_buckets.
     * 
     */
    @Import(name="netIpv4TcpMaxTwBuckets")
    private @Nullable Output<Integer> netIpv4TcpMaxTwBuckets;

    /**
     * @return Sysctl setting net.ipv4.tcp_max_tw_buckets.
     * 
     */
    public Optional<Output<Integer>> netIpv4TcpMaxTwBuckets() {
        return Optional.ofNullable(this.netIpv4TcpMaxTwBuckets);
    }

    /**
     * Sysctl setting net.ipv4.tcp_tw_reuse.
     * 
     */
    @Import(name="netIpv4TcpTwReuse")
    private @Nullable Output<Boolean> netIpv4TcpTwReuse;

    /**
     * @return Sysctl setting net.ipv4.tcp_tw_reuse.
     * 
     */
    public Optional<Output<Boolean>> netIpv4TcpTwReuse() {
        return Optional.ofNullable(this.netIpv4TcpTwReuse);
    }

    /**
     * Sysctl setting net.ipv4.tcp_keepalive_intvl.
     * 
     */
    @Import(name="netIpv4TcpkeepaliveIntvl")
    private @Nullable Output<Integer> netIpv4TcpkeepaliveIntvl;

    /**
     * @return Sysctl setting net.ipv4.tcp_keepalive_intvl.
     * 
     */
    public Optional<Output<Integer>> netIpv4TcpkeepaliveIntvl() {
        return Optional.ofNullable(this.netIpv4TcpkeepaliveIntvl);
    }

    /**
     * Sysctl setting net.netfilter.nf_conntrack_buckets.
     * 
     */
    @Import(name="netNetfilterNfConntrackBuckets")
    private @Nullable Output<Integer> netNetfilterNfConntrackBuckets;

    /**
     * @return Sysctl setting net.netfilter.nf_conntrack_buckets.
     * 
     */
    public Optional<Output<Integer>> netNetfilterNfConntrackBuckets() {
        return Optional.ofNullable(this.netNetfilterNfConntrackBuckets);
    }

    /**
     * Sysctl setting net.netfilter.nf_conntrack_max.
     * 
     */
    @Import(name="netNetfilterNfConntrackMax")
    private @Nullable Output<Integer> netNetfilterNfConntrackMax;

    /**
     * @return Sysctl setting net.netfilter.nf_conntrack_max.
     * 
     */
    public Optional<Output<Integer>> netNetfilterNfConntrackMax() {
        return Optional.ofNullable(this.netNetfilterNfConntrackMax);
    }

    /**
     * Sysctl setting vm.max_map_count.
     * 
     */
    @Import(name="vmMaxMapCount")
    private @Nullable Output<Integer> vmMaxMapCount;

    /**
     * @return Sysctl setting vm.max_map_count.
     * 
     */
    public Optional<Output<Integer>> vmMaxMapCount() {
        return Optional.ofNullable(this.vmMaxMapCount);
    }

    /**
     * Sysctl setting vm.swappiness.
     * 
     */
    @Import(name="vmSwappiness")
    private @Nullable Output<Integer> vmSwappiness;

    /**
     * @return Sysctl setting vm.swappiness.
     * 
     */
    public Optional<Output<Integer>> vmSwappiness() {
        return Optional.ofNullable(this.vmSwappiness);
    }

    /**
     * Sysctl setting vm.vfs_cache_pressure.
     * 
     */
    @Import(name="vmVfsCachePressure")
    private @Nullable Output<Integer> vmVfsCachePressure;

    /**
     * @return Sysctl setting vm.vfs_cache_pressure.
     * 
     */
    public Optional<Output<Integer>> vmVfsCachePressure() {
        return Optional.ofNullable(this.vmVfsCachePressure);
    }

    private SysctlConfigArgs() {}

    private SysctlConfigArgs(SysctlConfigArgs $) {
        this.fsAioMaxNr = $.fsAioMaxNr;
        this.fsFileMax = $.fsFileMax;
        this.fsInotifyMaxUserWatches = $.fsInotifyMaxUserWatches;
        this.fsNrOpen = $.fsNrOpen;
        this.kernelThreadsMax = $.kernelThreadsMax;
        this.netCoreNetdevMaxBacklog = $.netCoreNetdevMaxBacklog;
        this.netCoreOptmemMax = $.netCoreOptmemMax;
        this.netCoreRmemDefault = $.netCoreRmemDefault;
        this.netCoreRmemMax = $.netCoreRmemMax;
        this.netCoreSomaxconn = $.netCoreSomaxconn;
        this.netCoreWmemDefault = $.netCoreWmemDefault;
        this.netCoreWmemMax = $.netCoreWmemMax;
        this.netIpv4IpLocalPortRange = $.netIpv4IpLocalPortRange;
        this.netIpv4NeighDefaultGcThresh1 = $.netIpv4NeighDefaultGcThresh1;
        this.netIpv4NeighDefaultGcThresh2 = $.netIpv4NeighDefaultGcThresh2;
        this.netIpv4NeighDefaultGcThresh3 = $.netIpv4NeighDefaultGcThresh3;
        this.netIpv4TcpFinTimeout = $.netIpv4TcpFinTimeout;
        this.netIpv4TcpKeepaliveProbes = $.netIpv4TcpKeepaliveProbes;
        this.netIpv4TcpKeepaliveTime = $.netIpv4TcpKeepaliveTime;
        this.netIpv4TcpMaxSynBacklog = $.netIpv4TcpMaxSynBacklog;
        this.netIpv4TcpMaxTwBuckets = $.netIpv4TcpMaxTwBuckets;
        this.netIpv4TcpTwReuse = $.netIpv4TcpTwReuse;
        this.netIpv4TcpkeepaliveIntvl = $.netIpv4TcpkeepaliveIntvl;
        this.netNetfilterNfConntrackBuckets = $.netNetfilterNfConntrackBuckets;
        this.netNetfilterNfConntrackMax = $.netNetfilterNfConntrackMax;
        this.vmMaxMapCount = $.vmMaxMapCount;
        this.vmSwappiness = $.vmSwappiness;
        this.vmVfsCachePressure = $.vmVfsCachePressure;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SysctlConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SysctlConfigArgs $;

        public Builder() {
            $ = new SysctlConfigArgs();
        }

        public Builder(SysctlConfigArgs defaults) {
            $ = new SysctlConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fsAioMaxNr Sysctl setting fs.aio-max-nr.
         * 
         * @return builder
         * 
         */
        public Builder fsAioMaxNr(@Nullable Output<Integer> fsAioMaxNr) {
            $.fsAioMaxNr = fsAioMaxNr;
            return this;
        }

        /**
         * @param fsAioMaxNr Sysctl setting fs.aio-max-nr.
         * 
         * @return builder
         * 
         */
        public Builder fsAioMaxNr(Integer fsAioMaxNr) {
            return fsAioMaxNr(Output.of(fsAioMaxNr));
        }

        /**
         * @param fsFileMax Sysctl setting fs.file-max.
         * 
         * @return builder
         * 
         */
        public Builder fsFileMax(@Nullable Output<Integer> fsFileMax) {
            $.fsFileMax = fsFileMax;
            return this;
        }

        /**
         * @param fsFileMax Sysctl setting fs.file-max.
         * 
         * @return builder
         * 
         */
        public Builder fsFileMax(Integer fsFileMax) {
            return fsFileMax(Output.of(fsFileMax));
        }

        /**
         * @param fsInotifyMaxUserWatches Sysctl setting fs.inotify.max_user_watches.
         * 
         * @return builder
         * 
         */
        public Builder fsInotifyMaxUserWatches(@Nullable Output<Integer> fsInotifyMaxUserWatches) {
            $.fsInotifyMaxUserWatches = fsInotifyMaxUserWatches;
            return this;
        }

        /**
         * @param fsInotifyMaxUserWatches Sysctl setting fs.inotify.max_user_watches.
         * 
         * @return builder
         * 
         */
        public Builder fsInotifyMaxUserWatches(Integer fsInotifyMaxUserWatches) {
            return fsInotifyMaxUserWatches(Output.of(fsInotifyMaxUserWatches));
        }

        /**
         * @param fsNrOpen Sysctl setting fs.nr_open.
         * 
         * @return builder
         * 
         */
        public Builder fsNrOpen(@Nullable Output<Integer> fsNrOpen) {
            $.fsNrOpen = fsNrOpen;
            return this;
        }

        /**
         * @param fsNrOpen Sysctl setting fs.nr_open.
         * 
         * @return builder
         * 
         */
        public Builder fsNrOpen(Integer fsNrOpen) {
            return fsNrOpen(Output.of(fsNrOpen));
        }

        /**
         * @param kernelThreadsMax Sysctl setting kernel.threads-max.
         * 
         * @return builder
         * 
         */
        public Builder kernelThreadsMax(@Nullable Output<Integer> kernelThreadsMax) {
            $.kernelThreadsMax = kernelThreadsMax;
            return this;
        }

        /**
         * @param kernelThreadsMax Sysctl setting kernel.threads-max.
         * 
         * @return builder
         * 
         */
        public Builder kernelThreadsMax(Integer kernelThreadsMax) {
            return kernelThreadsMax(Output.of(kernelThreadsMax));
        }

        /**
         * @param netCoreNetdevMaxBacklog Sysctl setting net.core.netdev_max_backlog.
         * 
         * @return builder
         * 
         */
        public Builder netCoreNetdevMaxBacklog(@Nullable Output<Integer> netCoreNetdevMaxBacklog) {
            $.netCoreNetdevMaxBacklog = netCoreNetdevMaxBacklog;
            return this;
        }

        /**
         * @param netCoreNetdevMaxBacklog Sysctl setting net.core.netdev_max_backlog.
         * 
         * @return builder
         * 
         */
        public Builder netCoreNetdevMaxBacklog(Integer netCoreNetdevMaxBacklog) {
            return netCoreNetdevMaxBacklog(Output.of(netCoreNetdevMaxBacklog));
        }

        /**
         * @param netCoreOptmemMax Sysctl setting net.core.optmem_max.
         * 
         * @return builder
         * 
         */
        public Builder netCoreOptmemMax(@Nullable Output<Integer> netCoreOptmemMax) {
            $.netCoreOptmemMax = netCoreOptmemMax;
            return this;
        }

        /**
         * @param netCoreOptmemMax Sysctl setting net.core.optmem_max.
         * 
         * @return builder
         * 
         */
        public Builder netCoreOptmemMax(Integer netCoreOptmemMax) {
            return netCoreOptmemMax(Output.of(netCoreOptmemMax));
        }

        /**
         * @param netCoreRmemDefault Sysctl setting net.core.rmem_default.
         * 
         * @return builder
         * 
         */
        public Builder netCoreRmemDefault(@Nullable Output<Integer> netCoreRmemDefault) {
            $.netCoreRmemDefault = netCoreRmemDefault;
            return this;
        }

        /**
         * @param netCoreRmemDefault Sysctl setting net.core.rmem_default.
         * 
         * @return builder
         * 
         */
        public Builder netCoreRmemDefault(Integer netCoreRmemDefault) {
            return netCoreRmemDefault(Output.of(netCoreRmemDefault));
        }

        /**
         * @param netCoreRmemMax Sysctl setting net.core.rmem_max.
         * 
         * @return builder
         * 
         */
        public Builder netCoreRmemMax(@Nullable Output<Integer> netCoreRmemMax) {
            $.netCoreRmemMax = netCoreRmemMax;
            return this;
        }

        /**
         * @param netCoreRmemMax Sysctl setting net.core.rmem_max.
         * 
         * @return builder
         * 
         */
        public Builder netCoreRmemMax(Integer netCoreRmemMax) {
            return netCoreRmemMax(Output.of(netCoreRmemMax));
        }

        /**
         * @param netCoreSomaxconn Sysctl setting net.core.somaxconn.
         * 
         * @return builder
         * 
         */
        public Builder netCoreSomaxconn(@Nullable Output<Integer> netCoreSomaxconn) {
            $.netCoreSomaxconn = netCoreSomaxconn;
            return this;
        }

        /**
         * @param netCoreSomaxconn Sysctl setting net.core.somaxconn.
         * 
         * @return builder
         * 
         */
        public Builder netCoreSomaxconn(Integer netCoreSomaxconn) {
            return netCoreSomaxconn(Output.of(netCoreSomaxconn));
        }

        /**
         * @param netCoreWmemDefault Sysctl setting net.core.wmem_default.
         * 
         * @return builder
         * 
         */
        public Builder netCoreWmemDefault(@Nullable Output<Integer> netCoreWmemDefault) {
            $.netCoreWmemDefault = netCoreWmemDefault;
            return this;
        }

        /**
         * @param netCoreWmemDefault Sysctl setting net.core.wmem_default.
         * 
         * @return builder
         * 
         */
        public Builder netCoreWmemDefault(Integer netCoreWmemDefault) {
            return netCoreWmemDefault(Output.of(netCoreWmemDefault));
        }

        /**
         * @param netCoreWmemMax Sysctl setting net.core.wmem_max.
         * 
         * @return builder
         * 
         */
        public Builder netCoreWmemMax(@Nullable Output<Integer> netCoreWmemMax) {
            $.netCoreWmemMax = netCoreWmemMax;
            return this;
        }

        /**
         * @param netCoreWmemMax Sysctl setting net.core.wmem_max.
         * 
         * @return builder
         * 
         */
        public Builder netCoreWmemMax(Integer netCoreWmemMax) {
            return netCoreWmemMax(Output.of(netCoreWmemMax));
        }

        /**
         * @param netIpv4IpLocalPortRange Sysctl setting net.ipv4.ip_local_port_range.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4IpLocalPortRange(@Nullable Output<String> netIpv4IpLocalPortRange) {
            $.netIpv4IpLocalPortRange = netIpv4IpLocalPortRange;
            return this;
        }

        /**
         * @param netIpv4IpLocalPortRange Sysctl setting net.ipv4.ip_local_port_range.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4IpLocalPortRange(String netIpv4IpLocalPortRange) {
            return netIpv4IpLocalPortRange(Output.of(netIpv4IpLocalPortRange));
        }

        /**
         * @param netIpv4NeighDefaultGcThresh1 Sysctl setting net.ipv4.neigh.default.gc_thresh1.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4NeighDefaultGcThresh1(@Nullable Output<Integer> netIpv4NeighDefaultGcThresh1) {
            $.netIpv4NeighDefaultGcThresh1 = netIpv4NeighDefaultGcThresh1;
            return this;
        }

        /**
         * @param netIpv4NeighDefaultGcThresh1 Sysctl setting net.ipv4.neigh.default.gc_thresh1.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4NeighDefaultGcThresh1(Integer netIpv4NeighDefaultGcThresh1) {
            return netIpv4NeighDefaultGcThresh1(Output.of(netIpv4NeighDefaultGcThresh1));
        }

        /**
         * @param netIpv4NeighDefaultGcThresh2 Sysctl setting net.ipv4.neigh.default.gc_thresh2.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4NeighDefaultGcThresh2(@Nullable Output<Integer> netIpv4NeighDefaultGcThresh2) {
            $.netIpv4NeighDefaultGcThresh2 = netIpv4NeighDefaultGcThresh2;
            return this;
        }

        /**
         * @param netIpv4NeighDefaultGcThresh2 Sysctl setting net.ipv4.neigh.default.gc_thresh2.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4NeighDefaultGcThresh2(Integer netIpv4NeighDefaultGcThresh2) {
            return netIpv4NeighDefaultGcThresh2(Output.of(netIpv4NeighDefaultGcThresh2));
        }

        /**
         * @param netIpv4NeighDefaultGcThresh3 Sysctl setting net.ipv4.neigh.default.gc_thresh3.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4NeighDefaultGcThresh3(@Nullable Output<Integer> netIpv4NeighDefaultGcThresh3) {
            $.netIpv4NeighDefaultGcThresh3 = netIpv4NeighDefaultGcThresh3;
            return this;
        }

        /**
         * @param netIpv4NeighDefaultGcThresh3 Sysctl setting net.ipv4.neigh.default.gc_thresh3.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4NeighDefaultGcThresh3(Integer netIpv4NeighDefaultGcThresh3) {
            return netIpv4NeighDefaultGcThresh3(Output.of(netIpv4NeighDefaultGcThresh3));
        }

        /**
         * @param netIpv4TcpFinTimeout Sysctl setting net.ipv4.tcp_fin_timeout.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4TcpFinTimeout(@Nullable Output<Integer> netIpv4TcpFinTimeout) {
            $.netIpv4TcpFinTimeout = netIpv4TcpFinTimeout;
            return this;
        }

        /**
         * @param netIpv4TcpFinTimeout Sysctl setting net.ipv4.tcp_fin_timeout.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4TcpFinTimeout(Integer netIpv4TcpFinTimeout) {
            return netIpv4TcpFinTimeout(Output.of(netIpv4TcpFinTimeout));
        }

        /**
         * @param netIpv4TcpKeepaliveProbes Sysctl setting net.ipv4.tcp_keepalive_probes.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4TcpKeepaliveProbes(@Nullable Output<Integer> netIpv4TcpKeepaliveProbes) {
            $.netIpv4TcpKeepaliveProbes = netIpv4TcpKeepaliveProbes;
            return this;
        }

        /**
         * @param netIpv4TcpKeepaliveProbes Sysctl setting net.ipv4.tcp_keepalive_probes.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4TcpKeepaliveProbes(Integer netIpv4TcpKeepaliveProbes) {
            return netIpv4TcpKeepaliveProbes(Output.of(netIpv4TcpKeepaliveProbes));
        }

        /**
         * @param netIpv4TcpKeepaliveTime Sysctl setting net.ipv4.tcp_keepalive_time.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4TcpKeepaliveTime(@Nullable Output<Integer> netIpv4TcpKeepaliveTime) {
            $.netIpv4TcpKeepaliveTime = netIpv4TcpKeepaliveTime;
            return this;
        }

        /**
         * @param netIpv4TcpKeepaliveTime Sysctl setting net.ipv4.tcp_keepalive_time.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4TcpKeepaliveTime(Integer netIpv4TcpKeepaliveTime) {
            return netIpv4TcpKeepaliveTime(Output.of(netIpv4TcpKeepaliveTime));
        }

        /**
         * @param netIpv4TcpMaxSynBacklog Sysctl setting net.ipv4.tcp_max_syn_backlog.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4TcpMaxSynBacklog(@Nullable Output<Integer> netIpv4TcpMaxSynBacklog) {
            $.netIpv4TcpMaxSynBacklog = netIpv4TcpMaxSynBacklog;
            return this;
        }

        /**
         * @param netIpv4TcpMaxSynBacklog Sysctl setting net.ipv4.tcp_max_syn_backlog.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4TcpMaxSynBacklog(Integer netIpv4TcpMaxSynBacklog) {
            return netIpv4TcpMaxSynBacklog(Output.of(netIpv4TcpMaxSynBacklog));
        }

        /**
         * @param netIpv4TcpMaxTwBuckets Sysctl setting net.ipv4.tcp_max_tw_buckets.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4TcpMaxTwBuckets(@Nullable Output<Integer> netIpv4TcpMaxTwBuckets) {
            $.netIpv4TcpMaxTwBuckets = netIpv4TcpMaxTwBuckets;
            return this;
        }

        /**
         * @param netIpv4TcpMaxTwBuckets Sysctl setting net.ipv4.tcp_max_tw_buckets.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4TcpMaxTwBuckets(Integer netIpv4TcpMaxTwBuckets) {
            return netIpv4TcpMaxTwBuckets(Output.of(netIpv4TcpMaxTwBuckets));
        }

        /**
         * @param netIpv4TcpTwReuse Sysctl setting net.ipv4.tcp_tw_reuse.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4TcpTwReuse(@Nullable Output<Boolean> netIpv4TcpTwReuse) {
            $.netIpv4TcpTwReuse = netIpv4TcpTwReuse;
            return this;
        }

        /**
         * @param netIpv4TcpTwReuse Sysctl setting net.ipv4.tcp_tw_reuse.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4TcpTwReuse(Boolean netIpv4TcpTwReuse) {
            return netIpv4TcpTwReuse(Output.of(netIpv4TcpTwReuse));
        }

        /**
         * @param netIpv4TcpkeepaliveIntvl Sysctl setting net.ipv4.tcp_keepalive_intvl.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4TcpkeepaliveIntvl(@Nullable Output<Integer> netIpv4TcpkeepaliveIntvl) {
            $.netIpv4TcpkeepaliveIntvl = netIpv4TcpkeepaliveIntvl;
            return this;
        }

        /**
         * @param netIpv4TcpkeepaliveIntvl Sysctl setting net.ipv4.tcp_keepalive_intvl.
         * 
         * @return builder
         * 
         */
        public Builder netIpv4TcpkeepaliveIntvl(Integer netIpv4TcpkeepaliveIntvl) {
            return netIpv4TcpkeepaliveIntvl(Output.of(netIpv4TcpkeepaliveIntvl));
        }

        /**
         * @param netNetfilterNfConntrackBuckets Sysctl setting net.netfilter.nf_conntrack_buckets.
         * 
         * @return builder
         * 
         */
        public Builder netNetfilterNfConntrackBuckets(@Nullable Output<Integer> netNetfilterNfConntrackBuckets) {
            $.netNetfilterNfConntrackBuckets = netNetfilterNfConntrackBuckets;
            return this;
        }

        /**
         * @param netNetfilterNfConntrackBuckets Sysctl setting net.netfilter.nf_conntrack_buckets.
         * 
         * @return builder
         * 
         */
        public Builder netNetfilterNfConntrackBuckets(Integer netNetfilterNfConntrackBuckets) {
            return netNetfilterNfConntrackBuckets(Output.of(netNetfilterNfConntrackBuckets));
        }

        /**
         * @param netNetfilterNfConntrackMax Sysctl setting net.netfilter.nf_conntrack_max.
         * 
         * @return builder
         * 
         */
        public Builder netNetfilterNfConntrackMax(@Nullable Output<Integer> netNetfilterNfConntrackMax) {
            $.netNetfilterNfConntrackMax = netNetfilterNfConntrackMax;
            return this;
        }

        /**
         * @param netNetfilterNfConntrackMax Sysctl setting net.netfilter.nf_conntrack_max.
         * 
         * @return builder
         * 
         */
        public Builder netNetfilterNfConntrackMax(Integer netNetfilterNfConntrackMax) {
            return netNetfilterNfConntrackMax(Output.of(netNetfilterNfConntrackMax));
        }

        /**
         * @param vmMaxMapCount Sysctl setting vm.max_map_count.
         * 
         * @return builder
         * 
         */
        public Builder vmMaxMapCount(@Nullable Output<Integer> vmMaxMapCount) {
            $.vmMaxMapCount = vmMaxMapCount;
            return this;
        }

        /**
         * @param vmMaxMapCount Sysctl setting vm.max_map_count.
         * 
         * @return builder
         * 
         */
        public Builder vmMaxMapCount(Integer vmMaxMapCount) {
            return vmMaxMapCount(Output.of(vmMaxMapCount));
        }

        /**
         * @param vmSwappiness Sysctl setting vm.swappiness.
         * 
         * @return builder
         * 
         */
        public Builder vmSwappiness(@Nullable Output<Integer> vmSwappiness) {
            $.vmSwappiness = vmSwappiness;
            return this;
        }

        /**
         * @param vmSwappiness Sysctl setting vm.swappiness.
         * 
         * @return builder
         * 
         */
        public Builder vmSwappiness(Integer vmSwappiness) {
            return vmSwappiness(Output.of(vmSwappiness));
        }

        /**
         * @param vmVfsCachePressure Sysctl setting vm.vfs_cache_pressure.
         * 
         * @return builder
         * 
         */
        public Builder vmVfsCachePressure(@Nullable Output<Integer> vmVfsCachePressure) {
            $.vmVfsCachePressure = vmVfsCachePressure;
            return this;
        }

        /**
         * @param vmVfsCachePressure Sysctl setting vm.vfs_cache_pressure.
         * 
         * @return builder
         * 
         */
        public Builder vmVfsCachePressure(Integer vmVfsCachePressure) {
            return vmVfsCachePressure(Output.of(vmVfsCachePressure));
        }

        public SysctlConfigArgs build() {
            return $;
        }
    }

}
