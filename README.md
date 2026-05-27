# Flipped World

> Y axis fully inverted. Bedrock is the sky. Diamond appears near the top. Surface terrain is at mid-range. Every "dig down" intuition you've built up over a thousand hours becomes wrong.

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![NeoForge 1.21.1](https://img.shields.io/badge/NeoForge-1.21.1-orange.svg)](https://neoforged.net)
[![Depends on Isekai API](https://img.shields.io/badge/Depends-Isekai%20API-9333ea)](https://github.com/KURONAMI333/isekai-api)

---

## Concept

A novelty / experiment world. The vanilla rule set is preserved (ore frequencies, structure counts, mob spawn rates) — only the Y axis is mirrored. Look up: there's the bedrock. Look down: there's the sky. Dig up to mine diamonds.

Most useful as a screenshot-worthy weekend curiosity or a stress test for any mod that assumes "dig down = deeper".

## How it works

Flipped World is built on **[Isekai API](https://github.com/KURONAMI333/isekai-api)**, a neutral universal worldgen library.

This is the **most minimal consumer** in the set: just `RemapStrategy.Inverted` for ore/structure Y placement, plus `scale_coord(sy=-1)` on the density function to mirror the geometry. It's the proof that simple worldshape ideas should be expressible in *a few primitives*, not a Java module.

Datapack-first.

## Status

**v0.1**: skeleton. Datapack JSON + `RemapStrategy.Inverted` declaration land with Isekai API v0.2.

## Dependencies

- NeoForge 1.21.1
- [Isekai API](https://github.com/KURONAMI333/isekai-api) (required)

## License

[MIT License](LICENSE) — modpack inclusion welcome, no credit required.

## Credits

- Author: KURONAMI
