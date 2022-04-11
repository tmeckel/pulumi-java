// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcDhcpOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcDhcpOptionsArgs Empty = new VpcDhcpOptionsArgs();

    /**
     * the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
     * 
     */
    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName == null ? Codegen.empty() : this.domainName;
    }

    /**
     * List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
     * 
     */
    @Import(name="domainNameServers")
      private final @Nullable Output<List<String>> domainNameServers;

    public Output<List<String>> getDomainNameServers() {
        return this.domainNameServers == null ? Codegen.empty() : this.domainNameServers;
    }

    /**
     * List of NETBIOS name servers.
     * 
     */
    @Import(name="netbiosNameServers")
      private final @Nullable Output<List<String>> netbiosNameServers;

    public Output<List<String>> getNetbiosNameServers() {
        return this.netbiosNameServers == null ? Codegen.empty() : this.netbiosNameServers;
    }

    /**
     * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
     * 
     */
    @Import(name="netbiosNodeType")
      private final @Nullable Output<String> netbiosNodeType;

    public Output<String> getNetbiosNodeType() {
        return this.netbiosNodeType == null ? Codegen.empty() : this.netbiosNodeType;
    }

    /**
     * List of NTP servers to configure.
     * 
     */
    @Import(name="ntpServers")
      private final @Nullable Output<List<String>> ntpServers;

    public Output<List<String>> getNtpServers() {
        return this.ntpServers == null ? Codegen.empty() : this.ntpServers;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public VpcDhcpOptionsArgs(
        @Nullable Output<String> domainName,
        @Nullable Output<List<String>> domainNameServers,
        @Nullable Output<List<String>> netbiosNameServers,
        @Nullable Output<String> netbiosNodeType,
        @Nullable Output<List<String>> ntpServers,
        @Nullable Output<Map<String,String>> tags) {
        this.domainName = domainName;
        this.domainNameServers = domainNameServers;
        this.netbiosNameServers = netbiosNameServers;
        this.netbiosNodeType = netbiosNodeType;
        this.ntpServers = ntpServers;
        this.tags = tags;
    }

    private VpcDhcpOptionsArgs() {
        this.domainName = Codegen.empty();
        this.domainNameServers = Codegen.empty();
        this.netbiosNameServers = Codegen.empty();
        this.netbiosNodeType = Codegen.empty();
        this.ntpServers = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcDhcpOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> domainName;
        private @Nullable Output<List<String>> domainNameServers;
        private @Nullable Output<List<String>> netbiosNameServers;
        private @Nullable Output<String> netbiosNodeType;
        private @Nullable Output<List<String>> ntpServers;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcDhcpOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.domainNameServers = defaults.domainNameServers;
    	      this.netbiosNameServers = defaults.netbiosNameServers;
    	      this.netbiosNodeType = defaults.netbiosNodeType;
    	      this.ntpServers = defaults.ntpServers;
    	      this.tags = defaults.tags;
        }

        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = Codegen.ofNullable(domainName);
            return this;
        }
        public Builder domainNameServers(@Nullable Output<List<String>> domainNameServers) {
            this.domainNameServers = domainNameServers;
            return this;
        }
        public Builder domainNameServers(@Nullable List<String> domainNameServers) {
            this.domainNameServers = Codegen.ofNullable(domainNameServers);
            return this;
        }
        public Builder domainNameServers(String... domainNameServers) {
            return domainNameServers(List.of(domainNameServers));
        }
        public Builder netbiosNameServers(@Nullable Output<List<String>> netbiosNameServers) {
            this.netbiosNameServers = netbiosNameServers;
            return this;
        }
        public Builder netbiosNameServers(@Nullable List<String> netbiosNameServers) {
            this.netbiosNameServers = Codegen.ofNullable(netbiosNameServers);
            return this;
        }
        public Builder netbiosNameServers(String... netbiosNameServers) {
            return netbiosNameServers(List.of(netbiosNameServers));
        }
        public Builder netbiosNodeType(@Nullable Output<String> netbiosNodeType) {
            this.netbiosNodeType = netbiosNodeType;
            return this;
        }
        public Builder netbiosNodeType(@Nullable String netbiosNodeType) {
            this.netbiosNodeType = Codegen.ofNullable(netbiosNodeType);
            return this;
        }
        public Builder ntpServers(@Nullable Output<List<String>> ntpServers) {
            this.ntpServers = ntpServers;
            return this;
        }
        public Builder ntpServers(@Nullable List<String> ntpServers) {
            this.ntpServers = Codegen.ofNullable(ntpServers);
            return this;
        }
        public Builder ntpServers(String... ntpServers) {
            return ntpServers(List.of(ntpServers));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public VpcDhcpOptionsArgs build() {
            return new VpcDhcpOptionsArgs(domainName, domainNameServers, netbiosNameServers, netbiosNodeType, ntpServers, tags);
        }
    }
}
