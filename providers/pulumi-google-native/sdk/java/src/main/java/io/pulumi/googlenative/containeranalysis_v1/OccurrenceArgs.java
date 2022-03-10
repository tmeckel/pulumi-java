// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.AttestationOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.BuildOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.ComplianceOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.DSSEAttestationOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.DeploymentOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.DiscoveryOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.EnvelopeArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.ImageOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.PackageOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.UpgradeOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.VulnerabilityOccurrenceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final OccurrenceArgs Empty = new OccurrenceArgs();

    /**
     * Describes an attestation of an artifact.
     * 
     */
    @InputImport(name="attestation")
      private final @Nullable Input<AttestationOccurrenceArgs> attestation;

    public Input<AttestationOccurrenceArgs> getAttestation() {
        return this.attestation == null ? Input.empty() : this.attestation;
    }

    /**
     * Describes a verifiable build.
     * 
     */
    @InputImport(name="build")
      private final @Nullable Input<BuildOccurrenceArgs> build;

    public Input<BuildOccurrenceArgs> getBuild() {
        return this.build == null ? Input.empty() : this.build;
    }

    /**
     * Describes a compliance violation on a linked resource.
     * 
     */
    @InputImport(name="compliance")
      private final @Nullable Input<ComplianceOccurrenceArgs> compliance;

    public Input<ComplianceOccurrenceArgs> getCompliance() {
        return this.compliance == null ? Input.empty() : this.compliance;
    }

    /**
     * Describes the deployment of an artifact on a runtime.
     * 
     */
    @InputImport(name="deployment")
      private final @Nullable Input<DeploymentOccurrenceArgs> deployment;

    public Input<DeploymentOccurrenceArgs> getDeployment() {
        return this.deployment == null ? Input.empty() : this.deployment;
    }

    /**
     * Describes when a resource was discovered.
     * 
     */
    @InputImport(name="discovery")
      private final @Nullable Input<DiscoveryOccurrenceArgs> discovery;

    public Input<DiscoveryOccurrenceArgs> getDiscovery() {
        return this.discovery == null ? Input.empty() : this.discovery;
    }

    /**
     * Describes an attestation of an artifact using dsse.
     * 
     */
    @InputImport(name="dsseAttestation")
      private final @Nullable Input<DSSEAttestationOccurrenceArgs> dsseAttestation;

    public Input<DSSEAttestationOccurrenceArgs> getDsseAttestation() {
        return this.dsseAttestation == null ? Input.empty() : this.dsseAttestation;
    }

    /**
     * https://github.com/secure-systems-lab/dsse
     * 
     */
    @InputImport(name="envelope")
      private final @Nullable Input<EnvelopeArgs> envelope;

    public Input<EnvelopeArgs> getEnvelope() {
        return this.envelope == null ? Input.empty() : this.envelope;
    }

    /**
     * Describes how this resource derives from the basis in the associated note.
     * 
     */
    @InputImport(name="image")
      private final @Nullable Input<ImageOccurrenceArgs> image;

    public Input<ImageOccurrenceArgs> getImage() {
        return this.image == null ? Input.empty() : this.image;
    }

    /**
     * Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
     * 
     */
    @InputImport(name="noteName", required=true)
      private final Input<String> noteName;

    public Input<String> getNoteName() {
        return this.noteName;
    }

    /**
     * Describes the installation of a package on the linked resource.
     * 
     */
    @InputImport(name="package")
      private final @Nullable Input<PackageOccurrenceArgs> $package;

    public Input<PackageOccurrenceArgs> get$package() {
        return this.$package == null ? Input.empty() : this.$package;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * A description of actions that can be taken to remedy the note.
     * 
     */
    @InputImport(name="remediation")
      private final @Nullable Input<String> remediation;

    public Input<String> getRemediation() {
        return this.remediation == null ? Input.empty() : this.remediation;
    }

    /**
     * Immutable. A URI that represents the resource for which the occurrence applies. For example, `https://gcr.io/project/image@sha256:123abc` for a Docker image.
     * 
     */
    @InputImport(name="resourceUri", required=true)
      private final Input<String> resourceUri;

    public Input<String> getResourceUri() {
        return this.resourceUri;
    }

    /**
     * Describes an available package upgrade on the linked resource.
     * 
     */
    @InputImport(name="upgrade")
      private final @Nullable Input<UpgradeOccurrenceArgs> upgrade;

    public Input<UpgradeOccurrenceArgs> getUpgrade() {
        return this.upgrade == null ? Input.empty() : this.upgrade;
    }

    /**
     * Describes a security vulnerability.
     * 
     */
    @InputImport(name="vulnerability")
      private final @Nullable Input<VulnerabilityOccurrenceArgs> vulnerability;

    public Input<VulnerabilityOccurrenceArgs> getVulnerability() {
        return this.vulnerability == null ? Input.empty() : this.vulnerability;
    }

    public OccurrenceArgs(
        @Nullable Input<AttestationOccurrenceArgs> attestation,
        @Nullable Input<BuildOccurrenceArgs> build,
        @Nullable Input<ComplianceOccurrenceArgs> compliance,
        @Nullable Input<DeploymentOccurrenceArgs> deployment,
        @Nullable Input<DiscoveryOccurrenceArgs> discovery,
        @Nullable Input<DSSEAttestationOccurrenceArgs> dsseAttestation,
        @Nullable Input<EnvelopeArgs> envelope,
        @Nullable Input<ImageOccurrenceArgs> image,
        Input<String> noteName,
        @Nullable Input<PackageOccurrenceArgs> $package,
        @Nullable Input<String> project,
        @Nullable Input<String> remediation,
        Input<String> resourceUri,
        @Nullable Input<UpgradeOccurrenceArgs> upgrade,
        @Nullable Input<VulnerabilityOccurrenceArgs> vulnerability) {
        this.attestation = attestation;
        this.build = build;
        this.compliance = compliance;
        this.deployment = deployment;
        this.discovery = discovery;
        this.dsseAttestation = dsseAttestation;
        this.envelope = envelope;
        this.image = image;
        this.noteName = Objects.requireNonNull(noteName, "expected parameter 'noteName' to be non-null");
        this.$package = $package;
        this.project = project;
        this.remediation = remediation;
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
        this.upgrade = upgrade;
        this.vulnerability = vulnerability;
    }

    private OccurrenceArgs() {
        this.attestation = Input.empty();
        this.build = Input.empty();
        this.compliance = Input.empty();
        this.deployment = Input.empty();
        this.discovery = Input.empty();
        this.dsseAttestation = Input.empty();
        this.envelope = Input.empty();
        this.image = Input.empty();
        this.noteName = Input.empty();
        this.$package = Input.empty();
        this.project = Input.empty();
        this.remediation = Input.empty();
        this.resourceUri = Input.empty();
        this.upgrade = Input.empty();
        this.vulnerability = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AttestationOccurrenceArgs> attestation;
        private @Nullable Input<BuildOccurrenceArgs> build;
        private @Nullable Input<ComplianceOccurrenceArgs> compliance;
        private @Nullable Input<DeploymentOccurrenceArgs> deployment;
        private @Nullable Input<DiscoveryOccurrenceArgs> discovery;
        private @Nullable Input<DSSEAttestationOccurrenceArgs> dsseAttestation;
        private @Nullable Input<EnvelopeArgs> envelope;
        private @Nullable Input<ImageOccurrenceArgs> image;
        private Input<String> noteName;
        private @Nullable Input<PackageOccurrenceArgs> $package;
        private @Nullable Input<String> project;
        private @Nullable Input<String> remediation;
        private Input<String> resourceUri;
        private @Nullable Input<UpgradeOccurrenceArgs> upgrade;
        private @Nullable Input<VulnerabilityOccurrenceArgs> vulnerability;

        public Builder() {
    	      // Empty
        }

        public Builder(OccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestation = defaults.attestation;
    	      this.build = defaults.build;
    	      this.compliance = defaults.compliance;
    	      this.deployment = defaults.deployment;
    	      this.discovery = defaults.discovery;
    	      this.dsseAttestation = defaults.dsseAttestation;
    	      this.envelope = defaults.envelope;
    	      this.image = defaults.image;
    	      this.noteName = defaults.noteName;
    	      this.$package = defaults.$package;
    	      this.project = defaults.project;
    	      this.remediation = defaults.remediation;
    	      this.resourceUri = defaults.resourceUri;
    	      this.upgrade = defaults.upgrade;
    	      this.vulnerability = defaults.vulnerability;
        }

        public Builder attestation(@Nullable Input<AttestationOccurrenceArgs> attestation) {
            this.attestation = attestation;
            return this;
        }

        public Builder attestation(@Nullable AttestationOccurrenceArgs attestation) {
            this.attestation = Input.ofNullable(attestation);
            return this;
        }

        public Builder build(@Nullable Input<BuildOccurrenceArgs> build) {
            this.build = build;
            return this;
        }

        public Builder build(@Nullable BuildOccurrenceArgs build) {
            this.build = Input.ofNullable(build);
            return this;
        }

        public Builder compliance(@Nullable Input<ComplianceOccurrenceArgs> compliance) {
            this.compliance = compliance;
            return this;
        }

        public Builder compliance(@Nullable ComplianceOccurrenceArgs compliance) {
            this.compliance = Input.ofNullable(compliance);
            return this;
        }

        public Builder deployment(@Nullable Input<DeploymentOccurrenceArgs> deployment) {
            this.deployment = deployment;
            return this;
        }

        public Builder deployment(@Nullable DeploymentOccurrenceArgs deployment) {
            this.deployment = Input.ofNullable(deployment);
            return this;
        }

        public Builder discovery(@Nullable Input<DiscoveryOccurrenceArgs> discovery) {
            this.discovery = discovery;
            return this;
        }

        public Builder discovery(@Nullable DiscoveryOccurrenceArgs discovery) {
            this.discovery = Input.ofNullable(discovery);
            return this;
        }

        public Builder dsseAttestation(@Nullable Input<DSSEAttestationOccurrenceArgs> dsseAttestation) {
            this.dsseAttestation = dsseAttestation;
            return this;
        }

        public Builder dsseAttestation(@Nullable DSSEAttestationOccurrenceArgs dsseAttestation) {
            this.dsseAttestation = Input.ofNullable(dsseAttestation);
            return this;
        }

        public Builder envelope(@Nullable Input<EnvelopeArgs> envelope) {
            this.envelope = envelope;
            return this;
        }

        public Builder envelope(@Nullable EnvelopeArgs envelope) {
            this.envelope = Input.ofNullable(envelope);
            return this;
        }

        public Builder image(@Nullable Input<ImageOccurrenceArgs> image) {
            this.image = image;
            return this;
        }

        public Builder image(@Nullable ImageOccurrenceArgs image) {
            this.image = Input.ofNullable(image);
            return this;
        }

        public Builder noteName(Input<String> noteName) {
            this.noteName = Objects.requireNonNull(noteName);
            return this;
        }

        public Builder noteName(String noteName) {
            this.noteName = Input.of(Objects.requireNonNull(noteName));
            return this;
        }

        public Builder $package(@Nullable Input<PackageOccurrenceArgs> $package) {
            this.$package = $package;
            return this;
        }

        public Builder $package(@Nullable PackageOccurrenceArgs $package) {
            this.$package = Input.ofNullable($package);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder remediation(@Nullable Input<String> remediation) {
            this.remediation = remediation;
            return this;
        }

        public Builder remediation(@Nullable String remediation) {
            this.remediation = Input.ofNullable(remediation);
            return this;
        }

        public Builder resourceUri(Input<String> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }

        public Builder resourceUri(String resourceUri) {
            this.resourceUri = Input.of(Objects.requireNonNull(resourceUri));
            return this;
        }

        public Builder upgrade(@Nullable Input<UpgradeOccurrenceArgs> upgrade) {
            this.upgrade = upgrade;
            return this;
        }

        public Builder upgrade(@Nullable UpgradeOccurrenceArgs upgrade) {
            this.upgrade = Input.ofNullable(upgrade);
            return this;
        }

        public Builder vulnerability(@Nullable Input<VulnerabilityOccurrenceArgs> vulnerability) {
            this.vulnerability = vulnerability;
            return this;
        }

        public Builder vulnerability(@Nullable VulnerabilityOccurrenceArgs vulnerability) {
            this.vulnerability = Input.ofNullable(vulnerability);
            return this;
        }
        public OccurrenceArgs build() {
            return new OccurrenceArgs(attestation, build, compliance, deployment, discovery, dsseAttestation, envelope, image, noteName, $package, project, remediation, resourceUri, upgrade, vulnerability);
        }
    }
}
